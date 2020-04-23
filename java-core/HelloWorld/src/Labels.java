
public class Labels {
	
	
	public static void main(String [] args) {
		
		/*
		 * Labels give reference names to expressions, loops, and conditional statements
		 * that van be referred to later you cannot give labels to variables, methods, and classes
		 */
		outer:
		for (int i=0; i<3; i++) {
			
			inner:
			for(int j=0; j<=3; j++) {
				System.out.println("i: "+ i);
				System.out.println("j: "+ j);
				if(i==1) {
					break outer;
				}
			}
		}
	}

}
