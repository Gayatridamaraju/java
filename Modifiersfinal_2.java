package oops;

public class Modifiersfinal_2 {

	public static void main(String[] args) {
		// If you don't want the ability to override existing attribute values, declare attributes as final:

			  final int x = 10;
			  final double PI = 3.14;

			  public static void main(String[] args) {
				  Modifiersfinal_2 myObj = new Modifiersfinal_2();
			    myObj.x = 50; // will generate an error: cannot assign a value to a final variable
			    myObj.PI = 25; // will generate an error: cannot assign a value to a final variable
			    System.out.println(myObj.x);
			  
		

	}

}
