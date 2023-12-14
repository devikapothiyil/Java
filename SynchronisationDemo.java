package demo;

class MultiplicationTable{
	void printMultiplicationTable(int number){
		
		for(int i=1;i<=10;i++) {
			System.out.println(i+"x"+number+"="+i*number);
		}
	
      
	} 
}
class MyThread1 extends Thread{
	MultiplicationTable t;
	MyThread1(MultiplicationTable t){
		this.t=t;
	}
	public void run() {
		System.out.println(Thread.currentThread().getPriority());
		t.printMultiplicationTable(5);
	}
}
 
class MyThread2 extends Thread{
	MultiplicationTable t;
	MyThread2(MultiplicationTable t){
		this.t=t;
	}
	public void run() {
		System.out.println(Thread.currentThread().getPriority());
		t.printMultiplicationTable(7);
		
	}
}

public class SynchronisationDemo {
 
	public static void main(String[] args) {
		MultiplicationTable mult= new MultiplicationTable();
		MyThread1 t= new MyThread1(mult);
		t.start();
		MyThread2 t2=new MyThread2(mult);
		t2.setPriority(1);
		t2.start();
		
	}
}

