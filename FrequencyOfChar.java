/*
File          :  FrequencyOfChar.java
Description   :  Write a Java Program to find the frequency 
                 of a given character in a string
Author        :  Devika Rajeev
Version       :  1.0
Date          :  29/09/2023
*/ 

import java.util.Scanner;
public class FrequencyOfChar {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		String input=sc.nextLine();
		System.out.println("Enter the character:");
		char checkMe=sc.next().charAt(0);
		int charCount=checkFreq(input,checkMe);
		System.out.println("The number of occcurance of the character is "+charCount);
	
	}
	
	static int checkFreq(String input,char checkMe) {
		char[]charArray=input.toCharArray();
		int charCount=0;
		for(int i=0;i<input.length();i++) {
			if(charArray[i]==checkMe) {
				charCount++;
			}
		}
		return charCount;
	}	

}
