package seedu.addressbook.data.person;

public class Unit {
	
	private String unitNumber;
	
	public Unit(String unitNumber){
		this.unitNumber = unitNumber;
	}
	
	public String getUnitNumber(){
		return this.unitNumber;
	}
	
	public void setUnitNumber(String unitNumber){
		this.unitNumber = unitNumber;
	}
	
	public String toString(){
		return this.unitNumber;
	}
}
