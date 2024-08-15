package Practice;

import java.io.IOException;


class doneTest{
	
	 static void Testing() {
		 System.out.println(12+"Akshay"+"Pune");
	 }
}

class Test extends doneTest{
	
	static void Testing() {
		 System.out.println(24+"Satish"+"Mumbai");
	 }
	
	static void Testing2() {
		 System.out.println(24+"Satish"+"Mumbai");
	 }
}

class Test2 extends Test{
	
	static void Testing() {
		 System.out.println(24+"Vishal"+"Gurgaon");
	 }
}

public class TestCases {
	
	public static void main(String[] args) throws IOException {
		Test2.Testing();		
	}
	
}
