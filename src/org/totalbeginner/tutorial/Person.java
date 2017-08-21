package org.totalbeginner.tutorial;

public class Person {
	// fields
	private String name; // name of the person
	private int maximumBooks; // limit of books/person
	private String strAddress; // Street
	private String city; // City
	private String state; // State
	private String zip; // ZipCode
	
	public Person(String name, int maximumBooks, String strAddress, String city, String state,String zip ) {
		super();
		this.name = name;
		this.maximumBooks = maximumBooks;
		this.strAddress = strAddress;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}



	//constructors
	public Person() {
		super();
		this.name = "unknown name";
		this.maximumBooks = 3;
	}

	//methods
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMaximumBooks() {
		return maximumBooks;
	}

	public void setMaximumBooks(int maximumBooks) {
		this.maximumBooks = maximumBooks;
	}

	public String getStrAddress() {
		return strAddress;
	}

	public void setStrAddress(String strAddress) {
		this.strAddress = strAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	
	
	
	

	
		
}

