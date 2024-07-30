package methods;
public class Saloon
	{
	String name;
	customer cus;
	 
Saloon(String name,customer cus)
	 {
		 this.name=name;
		 this.cus=cus;
	 }
	 void display() 
	 {
		 System.out.println(name+" "+cus.city+" "+cus.country);
	 }
public static void main(String[] args) {
	customer c=new customer("vizag","India");
	Saloon s=new Saloon("ramu",c);
	s.display();
}
}
