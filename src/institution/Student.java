package institution;

public class Student {
	
	public String name;
	public int ID;
	public String department;
	public double GPA;
	public int phone;
	public String displayName(String name) {
		return name;
		
		
	}
	public void showGPA (double GPA) {
		System.out.println(GPA);
		
	}
	public static void main(String args[])
	{
		Student s=new Student();
		System.out.println(s.displayName("siri"));
		s.showGPA(3.5);
		
	}

}
