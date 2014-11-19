package models;

import java.util.ArrayList;
import java.util.List;

import play.data.validation.Constraints;

public class College {

	private static List<College> colleges;
	
	static{
		colleges.add(new College("BITS-Pilani","Goa"));
		colleges.add(new College("IIT", "Mumbai"));
	}
	
	public int internalId;
	public String shortName;
	@Constraints.Required
	public String fullName;
	@Constraints.Required
	public String address;
	
	public College(){}
	
	public College(String fullName,String address){
		this.fullName = fullName;
	}
	
	public static List<College> findAll(){
		return new ArrayList<College>(colleges);
	}
	
	public String toString(){
		return String.format("%s - %s", fullName,address);
	}
	
	public void save(){
		colleges.add(this);
	}
	
}
