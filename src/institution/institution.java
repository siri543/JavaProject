package institution;

import java.util.Date;

public class institution {
    protected String name;
    private Date establishDate;
    private String address;
    private int code;
    private int departments;
    public institution() {
    	
    }
    public institution(String name,Date date,String address) {
    	this.name = name;
    	establishDate = date;
    	this.address = address;
    }
    public void setAddress(String add) {
    	this.address = add;
    }
    public String getAddress(String add) {
    	return this.address;
    	
    }
    public void setcode(int add) {
    	this.code = add;
    	
    }
    public void setdepartment(int add) {
    	this.departments = add;
    	
    }
    public int getcode() {
    	return this.code;
    	
    }
    public int getdepartment() {
    	return this.departments;
    	
    			
    	
    }
    public String getAddress() {
    	return this.address;
    }

}

