package edu.wit.cs.comp1000;

import java.util.Scanner;

// TODO: document this class
public class PA1a {


	public static void main(String[] args) {
		/*
	int yards = 0;
	int feet = 0;
	int inches = 0;
	int total = 0;
	Scanner input = new Scanner(System.in);
	System.out.print("Enter number of yards in whole numbers:");
	yards = input.nextInt();
	System.out.print("Enter number of feet in whole numbers:");
	feet = input.nextInt();
	System.out.print("Enter number of inches in whole numbers:");
	inches = input.nextInt();
	total = (yards*3*12)+ (feet*12)+(inches); 
	System.out.print("The number of inches is "+total);
	*/
	Scanner input = new Scanner(System.in);
    System.out.printf("Enter total inches:");
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

	