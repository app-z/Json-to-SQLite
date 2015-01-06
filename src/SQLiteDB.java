import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class SQLiteDB {

	
	String getFieldAsType(Field field){
		String typeField = null;
		Class<?> type = field.getType();
		
		switch (type.toString()) {
		case "class java.lang.String":
			typeField = "TEXT";
			break;
		case "class java.lang.Float":
			typeField = "FLOAT";
			break;
		case "class java.lang.Double":
			typeField = "REAL";
			break;
		case "class java.lang.Integer":
			typeField = "INTEGER";
			break;
		case "class java.lang.Boolean":
			typeField = "BOOLEAN";
			break;
		default:
			new IllegalArgumentException();
			break;
		}
		return typeField;
	}

	/*
	 * 
	 * 	Convert List of Object to SQLite DataBase
	 * 
	 */
	void createDb(String dbName, String tableName, List<?> dataList, Field[] fields){
		// load the sqlite-JDBC driver using the current class loader
		try {
			Class.forName("org.sqlite.JDBC");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
			return;
		}

		String strSqlCreate = "CREATE TABLE " + tableName + " (\n";
		strSqlCreate += "_id INTEGER PRIMARY KEY AUTOINCREMENT, ";
		for (Field field : fields) {
			System.out.println(field.getName() + "=>" + field.getType());
			strSqlCreate += field.getName() + " " + getFieldAsType(field) + ", ";
		}
		strSqlCreate = strSqlCreate.substring(0, strSqlCreate.length() - 2);
		strSqlCreate += ");";
		System.out.println(strSqlCreate);

		Connection connection = null;
		try {
			// create a database connection
			connection = DriverManager.getConnection("jdbc:sqlite:" + dbName);
			Statement statement = connection.createStatement();
			statement.setQueryTimeout(30); // set timeout to 30 sec.

			statement.executeUpdate("drop table if exists " + tableName);
			statement.executeUpdate(strSqlCreate);

			statement.execute("BEGIN TRANSACTION;");
			for (Object dataItem : dataList) {
				String values = "";
				for (Field field : fields) {
					field.setAccessible(true);
					Object val = field.get(dataItem);
					val = val != null ? val : "";
					val = val.toString().replace("'", "''");
					values += "'" + val + "',";
				}
				values = "?, "	+ values.substring(0, values.length() - 1);
				System.out.println(values);
				statement.execute("INSERT INTO " + tableName + " VALUES(" + values + ");");
			}
			statement.execute("COMMIT TRANSACTION;");

			/*
			ResultSet rs = statement.executeQuery("select * from " + tableName);
			while (rs.next()) {
				// read the result set
				System.out.println("id = " + rs.getInt("_id") + " "	+ rs.getString(2));
			}*/
		} catch (SQLException e) {
			// if the error message is "out of memory",
			// it probably means no database file is found
			System.err.println(e.getMessage());
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} finally {
			try {
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				// connection close failed.
				System.err.println(e);
			}
		}
	}
}
