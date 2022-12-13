package Assignment3_26_11_22;

public class Q2Address {
	String city, state, country;

	Q2Address(String city,String state,String country) {
		this.city=city;
		this.state=state;
		this.country=country;
	}
	@Override
	public String toString() {
		return "City: "+city+",\nState: "+state+",\nCountry: "+country;
	}
}
