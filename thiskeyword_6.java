package oops;

public class thiskeyword_6 {

public static void main(String[] args) {
		// TODO Auto-generated method stub
THIS KEYWORD:
		/*There can be a lot of usage of Java this keyword.
		In Java, this is a reference variable that refers to the current object.*/
		//public class Student{  
			int rollno;  
			String name,course;  
			float fee;  
			Student(int rollno,String name,String course){  
			this.rollno=rollno;  
			this.name=name;  
			this.course=course;  
			}  
			Student(int rollno,String name,String course,float fee){  
			this(rollno,name,course);//reusing constructor  
			this.fee=fee;  
			}  
			void display(){
				System.out.println(rollno+" "+name+" "+course+" "+fee);}  
			
		
			public static void main(String args[]){  
			Student s1=new Student(111,"ankit","java");  
			Student s2=new Student(112,"sumit","java",6000f);  
			s1.display();  
			s2.display();  
			} 

	
	}
	



