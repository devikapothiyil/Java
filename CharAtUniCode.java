package demo;
import java.util.Scanner;
public class CharAtUniCode {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String input="w3resources.com";
		System.out.println("Enter the index:");
		int index= sc.nextInt();
		System.out.println("Original String = w3resource.com");
		int unicode= input.codePointAt(index);
		System.out.println("Character(Unicode point)="+ unicode);
		

	}

}
