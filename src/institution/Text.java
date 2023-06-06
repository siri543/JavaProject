package institution;
import java.util.*;

public class Text {
	public static void main(String a[])
	{
		institution i=new institution();
		i.name="technodeed";
		institution i2=new institution("",new Date(),"514 pemberwich");
		i2.setAddress("2304 pemberwich");
		System.out.println(i2.getAddress());
		i2.setcode(9870);
		i2.setdepartment(24);
		System.out.println(i2.getcode());
		System.out.println(i2.getdepartment());
		
		//institution emp = new Employee("siri","technodeed");
		//emp.setAddress("set parent class Address");
		
	}
	
	
	
	

}
