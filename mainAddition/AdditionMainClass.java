package mainAddition;

import additionPackage.AdditionClass;

public class AdditionMainClass {

	public static void main(String[] args) {
		
		// Creating an object
		AdditionClass adding = new AdditionClass();
		
		System.out.println("The first object are equal to " + adding.addNumber());
		
		// Creating an object
		AdditionClass adding1 = new AdditionClass(10,30);
		
		System.out.println("The second object are equal to " + adding1.addNumber());

	}

}
