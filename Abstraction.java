package gayi1;


	// Abstract Class declared
	abstract class Animal {
	    private String name;

	    public Animal(String name) { this.name = name; }

	    public abstract void makeSound();

	    public String getName() { return name; }
	}

	// Abstracted class
	class Dog extends Animal {
	    public Dog(String name) { super(name); }

	    public void makeSound()
	    {
	        System.out.println(getName() + " barks");
	    }
	}

	// Abstracted class
	class Cat extends Animal {
	    public Cat(String name) { super(name); }

	    public void makeSound()
	    {
	        System.out.println(getName() + " meows");
	    }
	}// Java Program to implement
		// Java Abstraction
	public class Abstraction {
		// Java Abstraction

	// Driver Class
	    // Main Function
	    public static void main(String[] args)
	    {
	        Animal myDog = new Dog("Buddy");
	        Animal myCat = new Cat("Fluffy");

	        myDog.makeSound();
	        myCat.makeSound();
	    }
	}

