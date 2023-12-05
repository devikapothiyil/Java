import java.util.Scanner;
public class TryCatch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char choice='y';
		while(choice=='y') {
			System.out.println("Enter the first number:");
			int number1=sc.nextInt();
			System.out.println("Enter the second number:");
			int number2=sc.nextInt();
			try {
				int result=number1/number2;
				System.out.println("Result="+result);
			}catch(Exception e){
				System.out.println("Divison by zero not possible!!");
			}
			finally {
				System.out.println("End of operation");
				System.out.println("Do you want to continue?");
				choice=sc.next().charAt(0);
			}
		}

	}

}
