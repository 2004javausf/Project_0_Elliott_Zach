package com.example.lambda;

public class MainDriver {

	public static void main(String[] args) {
		
		//cannot instantiate an interface
		//MyInterface myInt = new MyInterface();
		
		//Anonymous interface implementation
		//They are anonymous because it doesn't have a class name
		//only reference variable
		MyInterface myInt = new MyInterface(){
			@Override
			public void printer(String s) {
				System.out.println(s);
			}
		};
		
		myInt.printer("What Just Happened?");
		
		MyOtherInterface myInt2 = new MyOtherInterface() {

			@Override
			public void method1() {
				System.out.println("m1");
				
			}

			@Override
			public void method2() {
				System.out.println("m2");
				
			}
	};
	
	myInt2.method1();
	
	//Lambdas
	//A lambda is basically a disembodied anonymous method
	//so it is not attached to an object, and it uses functional interfaces 
	
	MyInterface lambda = (String s) -> System.out.println(s);
	//Only works with functional interfaces MyOtherInterface is not functional because it has 2 abstracts 
	//MyOtherInterface lambda2 = () -> System.out.println("nope");
	
	lambda.printer("Mind Blown");
	
	//multiline lambdas need {}; after arrow
	MyInterface lambda2 = (String s) -> {System.out.println(s);
	s+= " World";
	System.out.println(s);
	};
	
	lambda2.printer("Hello");
	
	Thread th = new Thread(()-> {System.out.println("in runnable" + Thread.currentThread().getName());});
	th.start();

}
}
