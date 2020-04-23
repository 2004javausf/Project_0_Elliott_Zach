package com.example.day8.statics;

public class StaticExample {

	public static void main(String[] args) {
		
//		for(String s: args) {
//			System.out.println(s);
//		}
//		
//		HelperClass hClass = new HelperClass();
//		hClass.getMain();
		StaticExample stat = new StaticExample();
		stat.doSomething();
		doStaticSomething();
		
		HelperClass.doStaticAgain();
		
		//The variable value is static so it belongs to the class each instance of the class 
		//will share the same value variable
		//HelperClass.value = 0;
		//System.out.println(HelperClass.value);
		//HelperClass hClass = new HelperClass();
		//hClass.name = "This is a helper class";
		//System.out.println(hClass.name);
		//hClass.value = 9;
		//System.out.println(hClass.value);
		//HelperClass.value = 10;
		//System.out.println(hClass.value);
		//HelperClass hClass2 = new HelperClass();
		//System.out.println(hClass2.value);
		HelperClass hClass2 = new HelperClass(5, "helperClass");

	}
	
	public void doSomething() {
		//System.out.println("Doing Stuff");
		//HelperClass.value = 0;
		//System.out.println(HelperClass.value);
	}
	
	public static void doStaticSomething() {
		//System.out.println("Doing Stuff Statically");
	}

}
