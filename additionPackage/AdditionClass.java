package additionPackage;

public class AdditionClass {
	
	int firstNum;
	int secondNum;
	
	public int addNumber(){
		return (firstNum + secondNum);
	}
	
	
	// Creating a constructor
	// These are default constructor
	public AdditionClass(){
		firstNum = 5;
		secondNum = 10;
	}
	
	public AdditionClass(int x, int y){
		firstNum = x;
		secondNum = y;
	}
}
