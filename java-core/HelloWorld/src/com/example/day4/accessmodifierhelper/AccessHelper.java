package com.example.day4.accessmodifierhelper;

import com.example.day4.accessmodifier.Clothing;

public class AccessHelper extends Clothing {

	
		void testMethod() {
			//example of how you cannot access default fields in subclasses
		//	System.out.println(super.material);
			System.out.println(super.type);
		}
		
		public static void main(String[] args) {
			Clothing cloth = new Clothing();
			AccessHelper access = new AccessHelper();
			access.type = "Jacket";
			cloth.cost = 0;
		}

	}


