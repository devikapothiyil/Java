package demo;
import java.util.Scanner;
public class StringChar {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String input="Java Exercises!";
		System.out.println("Enter the index:");
		int index=sc.nextInt();
		System.out.println("Original String= Java Exercises!");
		System.out.println("The character at index "+ index + " is " +input.charAt(index));
       
	}

}
