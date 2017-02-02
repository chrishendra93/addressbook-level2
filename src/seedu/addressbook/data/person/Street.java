package seedu.addressbook.data.person;

public class Street {
	private String streetName;
	
	public Street(String streetName){
		this.streetName = streetName;
	}
	
	public String getStreetName(){
		return this.streetName;
	}
	
	public void setStreetName(String streetName){
		this.streetName = streetName;
	}
	
	public String toString(){
		return this.streetName;
	}
}
