package institution;

public class Address {
	public String street;
	public String zipcode;
	public String city;
	public String country;
	public Address(String street,String zipcode,String city,String country)
	{
		this.street=street;
		this.zipcode=zipcode;
		this.city=city;
		this.country=country;
		
	}
	public String toString()

	{
		return street+" "+city+" "+zipcode+" "+country;
		
	}

	
	

}
