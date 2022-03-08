package com.javaslidesexercise.exercise35;


public class PassByValue {
	static int k = 10;
	static void passPrimitive(int j) {
		System.out.println("the value of passed primitive is "+j);
	}
	
	static void passReference(EmployeeTest emp) {
		EmployeeTest reference = emp;
		System.out.println("the value of name property of our object is " + emp.getName());
		reference.setName("Bond");
	}
	
	public static void main(String[] args) {
		EmployeeTest ref = new EmployeeTest();
		ref.setName("James");
		passPrimitive(k);
		System.out.println("Value of primitive after get passed to method is "+k);
		passReference(ref);
		System.out.println("Value of property of object after reference get passed to method is "+ ref.getName());

	}

}

class EmployeeTest{
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
}
