package week1.day2;

public class Calculator {
	public int getAdd (int a, int b) {
		System.out.println(a+b); 
		return a+b;
	}
	public double getSub (double a, double b) {
		System.out.println(a-b); 
		return a-b;
	}
	public double getMultiply (double a, double b) {
		System.out.println(a*b); 
		return a*b;
	}
	public int getDivide (int a, int b) {
		System.out.println(a/b); 
		System.out.println(a%b);
		return a/b;
		
	}
	public String getCal (String f) {
		System.out.println("Calculator Values below:"); 
		return "Calculator Values below:";
		
	}
	public static void main(String[] args) {
		Calculator value = new Calculator ();
		value.getCal("Calculator Values below:");
		value.getAdd(1,2);
		value.getSub(3.5,2.4);
		value.getMultiply(15.2,12.6);
		value.getDivide(10,2);
		
	}
}
