import java.util.Scanner;
import java.util.StringTokenizer;
public class StringTokenizerInteger {
	
    public static void main(String[] args) {
    int sum=0;
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter the String:");
	String numbers = sc.nextLine(); 
	StringTokenizer input= new StringTokenizer(numbers);
	
	while(input.hasMoreTokens()) {
		  int num=Integer.parseInt(input.nextToken());
		  System.out.println(num);
          sum=sum+num;
	   }
	System.out.println("Sum="+sum);
	}
}

