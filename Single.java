package gayi;
import java.io.*;
import java.lang.*;
import java.util.*;



	// Java program to illustrate the
	// concept of single inheritance
		// Parent class
	class One {
	    public void print_geek()
	    {
	        System.out.println("Geeks");
	    }
	}

	class Two extends One {
	    public void print_for() { System.out.println("for"); }
	}
	public class Single {

	// Driver class
	      // Main function
	    public static void main(String[] args)
	    {
	        Two g = new Two();
	        g.print_geek();
	        g.print_for();
	        g.print_geek();
	    }
	}

