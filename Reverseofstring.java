package com.sat.in;
import java.io.*;
import java.util.Scanner;



public class Reverseofstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Java Program to Reverse a Word
		      
		        String str= "Geeks", nstr="";
		        
		      
		      System.out.print("Original word: ");
		      System.out.println("Geeks"); //Example word
		      
		      for (int i=0; i<str.length(); i++)
		      {
		       char ch= str.charAt(i); //extracts each character
		        nstr= ch+nstr; //adds each character in front of the existing string
		      }
		      System.out.println("Reversed word: "+ nstr);
		    }
	


	}


