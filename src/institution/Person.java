package institution;

public class Person {
	String Pname="Siri";
	int Page=23;
	String Pemail="siri@gmail.com";
	String Pphone="5597129007";
	float Pheight;
	float Pweight;
	public void displayDetails()
	{
		System.out.println(Pname +" "+ Page);
	}
	public String showPemail()
	{
		return Pemail;
		
	}
	public static void main(String args[]) {
		Person p=new Person();
		p.displayDetails();
		System.out.println(p.showPemail());
		
	}

}
