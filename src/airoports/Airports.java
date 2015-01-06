package airoports;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;

public class Airports {

	@Expose
	private List<Airport> airports = new ArrayList<Airport>();

	/**
	 * 
	 * @return The airports
	 */
	public List<Airport> getAirports() {
		return airports;
	}

	/**
	 * 
	 * @param airports
	 *            The airports
	 */
	public void setAirports(List<Airport> airports) {
		this.airports = airports;
	}

	public Airports withAirports(List<Airport> airports) {
		this.airports = airports;
		return this;
	}

}