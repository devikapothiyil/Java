import java.util.Scanner;
class Multiply{
	public synchronized void printMultiplicationTable (int num) {
		for(int i=1;i<=5;i++) {
			System.out.println(num+"x"+i+"="+i*num);
			}
	}
}
class Thread1 extends Thread{
	Multiply t1;
	int num1;
	Thread1(Multiply t){
		this.t1=t;
	}
	public Thread1(Multiply t1,int num1) {
		this.t1=t1;
		this.num1=num1;
	}
	public void run() {
		t1.printMultiplicationTable(num1);
	}
}
class Thread2 extends Thread{
	Multiply t2;
	int num2;
	Thread2(Multiply t){
		this.t2=t;
	}
	public Thread2(Multiply t2,int num2) {
		this.t2=t2;
		this.num2=num2;
	}
	public void run() {
		t2.printMultiplicationTable(num2);
	}
}
class Thread3 extends Thread{
	Multiply t3;
	int num3;
	Thread3(Multiply t){
		this.t3=t;
	}
	public Thread3(Multiply t3,int num3) {
		this.t3=t3;
		this.num3=num3;
	}
	public void run() {
		t3.printMultiplicationTable(num3);
	}
}

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the table you want to print by thread1:");
		int numb1=sc.nextInt();
		System.out.println("Enter the table you want to print by thread2:");
		int numb2=sc.nextInt();
		System.out.println("Enter the table you want to print by thread3:");
		int numb3=sc.nextInt();
		Multiply m= new Multiply();
		Thread1 t1=new Thread1(m,numb1);
		Thread2 t2=new Thread2(m,numb2);
		Thread3 t3=new Thread3(m,numb3);
		
		t1.start();
		try {
			t1.join();
		}
		catch(InterruptedException e){
			e.printStackTrace();
			
		}
		t2.start();
		try {
			t2.join();
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		t3.start();
		try {
			t2.join();
		}
		catch(InterruptedException e){
			e.printStackTrace();

	    }
	}
	
}
