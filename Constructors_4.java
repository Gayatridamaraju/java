package oops;

 public class Constructors_4{
	
    //In Java, a constructor is a block of codes similar to the method. 
	/*A constructor in Java is a special method that is used to initialize objects. 
	 * The constructor is called when an object of a class is created. 
	 * It can be used to set initial values for object attributes.
	 * TYPES OF CONSTRUCTORS:
 ** Default:-
	 * Every time an object is created using the new() keyword, at least one constructor is called.
It calls a default constructor if there is no constructor available in the class.
 In such case, Java compiler provides a default constructor by default.
 syntax:
	 public classname();
Java Program to create and call a default constructor */ 
 //public class Bike1{  
//creating a default constructor
class Bike1{
Bike1(){
	System.out.println("Bike is created");
	}  
//main method  
public static void main(String args[]){  
//calling a default constructor  
Bike1 b1=new Bike1();  

}  
}
 /*parametrized:
  * The parameterized constructor is used to provide different values to distinct objects. 
  * However, you can provide the same values also.
  * SYNTAX:
  * classname(intx,string y);
  */
//Java Program to demonstrate the use of the parameterized constructor.  
 public class Student{  
  int id;  
  String name;  
  //creating a parameterized constructor  
  Student(int i,String n){  
  id = i;  
  name = n;  
  }
  //method to display the values  
  void display()
  {
	  System.out.println(id+" "+name);
	  }  
 //public class Student {
  public static void main(String args[]){  
  //creating objects and passing values  
  Student s1 = new Student(888,"rajitha");  
  Student s2 = new Student(222,"Aryan");  
  //calling method to display the values of object  
  s1.display();  
  s2.display();  
 }
 }
}
 
 

     

     
	

	

