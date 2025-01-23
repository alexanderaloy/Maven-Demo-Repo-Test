package demoPackage;

/*
public class TestClass {
	
	public TestClass(String s , int a) {
	System.out.println(s + ", "+a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestClass obj = new TestClass("Test Value",5);
	}

}
*/


public class TestClass {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestClass obj = new TestClass();
		obj.displayvalues("testvalue new ",5);
	}
	
	public void displayvalues(String s , int a) {
	System.out.println(s + ", "+a);
	}

}

