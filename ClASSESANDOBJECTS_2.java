package oops;

public class ClASSESANDOBJECTS_2{
	/*Java is an object-oriented programming language.

	Everything in Java is associated with classes and 
	objects, along with its attributes and methods. 
	For example: in real life, a car is an object. 
	The car has attributes, such as weight and color, 
	and methods, such as drive and brake.
	
     1. Class:-
      
	  *Class is like an object constructor, 
	  or a "blueprint" for creating objects.*/
	
	//To create a class, use the keyword class:
		public class Main{
			int x=30;
		
      /*2.OBJECT:-
		In Java, an object is created from a class.
		 We have already created the class named Main,
		  so now we can use this to create objects.*/

/*To create an object FOR CLASS, specify the class name, 
followed by the object name,use the keyword new*/
	public static void main(String[] args) {
    Main myobj=new Main();
    
   System.out.println(myobj.x);
    


}
}