package oops;
/*attributes are also known as variables for the class.
 * another term is it is also known as fields.
*represented by dot(.)*/
//System.out.println(myobj.x);

//You can also modify attribute values:
		//Set the value of x to 40:


/*public class Attributes {
		  int x;

		  public static void main(String[] args) {
		    Main myObj = new Main();
		    myObj.x = 40;
		    System.out.println(myObj.x);
		  }
}*/
//override
/*public class Attributes {
	  int x = 10;

	  public static void main(String[] args) {
	    Main myObj = new Main();
	    myObj.x = 25; // x is now 25
	    System.out.println(myObj.x);
	  }
}*/
//If you don't want the ability to override
//existing values, declare the attribute as final://
public class Attributes_3 {
	  final int x = 10;

	  public static void main(String[] args) {
	    Main myObj = new Main();
	    myObj.x = 25; // x is now 25
	    System.out.println(myObj.x);
	  }
}


			  

