package edu.wit.cs.comp1000;

import java.util.Scanner;

// TODO: document this class
public class PA1b {

	// TODO: document this function
	public static void main(String[] args) {
		// TODO: write your code here	Scanner input = new Scanner(System.in);
	    System.out.printf("Enter total inches:");
	    Scanner input = null;
		int inches = input.nextInt();
	    int yards = inches/36;
	    int inchesf = inches % 36;
	    int feet = inchesf/12;
	    int inchesT = inchesf % 12;
	    System.out.println("yards:" +yards);
	    System.out.println("feet" +feet);		
	    System.out.println("inches:" +inchesT);
	    
	   
		
		}

	
	}


