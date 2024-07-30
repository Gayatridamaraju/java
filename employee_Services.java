package arraylist;
import java.util.*;
public class employee_Services {
	HashMap<Integer,employee>hm=new HashMap<Integer,employee>();
	employee_Services()
	{
		hm.put(1,new employee(101,"abc",30000));
		hm.put(2,new employee(102,"abcd",40000));
		hm.put(3,new employee(103,"abcde",50000));
		hm.put(4,new employee(104,"abcdef",60000));
		hm.put(5,new employee(105,"ab",70000));
	}
	void display(){
		for(Map.Entry<Integer,employee>x:hm.entrySet())
		{
			System.out.println(x.getKey()+" "+x.getValue());
		}
	}
	void view() {
		System.out.println(hm);
	}
	void SearchEmployee() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the search key");
		int s_id=sc.nextInt();
		boolean flag=false;
		employee so=null;
		for(Map.Entry<Integer,employee>x:hm.entrySet())
		{
			if(s_id==x.getKey())
			{
				flag=true;
				so=x.getValue();
				break;
				}
		}
		if(flag)
		{
			
		
	}
		}
	}
	

}
