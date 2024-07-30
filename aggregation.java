package methods;

public class aggregation{

public class saloon
	{
		String name;
		 customer c;
		 saloon(String name,customer c)
		 {
			 this.name=name;
			 this.c=c;
		 }
		 void display() 
		 {
			 System.out.println(name+" "+c.city+" "+c.country);
		 }
	public static void main(String[] args) {
		customer c=new customer("vizag","India");
		saloon s=new saloon("ramu",c);
		s.display();
	}
	}
}
