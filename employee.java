package arraylist;

public class employee {
int id;
String name;
int salary;
public employee(int id,String name,int salary) {
	this.id=id;
	this.name=name;
	this.salary=salary;
}
@Override
public String toString() {
	return "employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}


}
