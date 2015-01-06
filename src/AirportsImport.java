import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import airoports.Airport;
import airoports.Airports;

import com.google.gson.Gson;

public class AirportsImport {

	public static void main(String[] args) throws Exception {

		SQLiteDB sqlite = new SQLiteDB();
		Gson gson = new Gson();

		String jStr = LoadAssetFile("airports.json");
		Airports airoports = gson.fromJson(jStr, Airports.class);

		// for( Airport airoport : airoports.getAirports()){
		// System.out.println(airoport.getCity());
		// }

		sqlite.createDb("airports.db", airoports.getClass().getSimpleName()
				.toLowerCase(), airoports.getAirports(),
				Airport.class.getDeclaredFields());

	}

	/*
	 * 
	 * Read file from Asset
	 */
	static public String LoadAssetFile(String inFile) {
		String str = "";
		StringBuilder buff = new StringBuilder();
		try {
			BufferedReader in = new BufferedReader(new FileReader(inFile));
			while ((str = in.readLine()) != null) {
				buff.append(str);
			}
		} catch (IOException e) {
			System.out.println(e);
		}
		return buff.toString();
	}

}
