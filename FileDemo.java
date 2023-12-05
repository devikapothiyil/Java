import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class FileDemo {

	public static void main(String[] args) {
		char[] data= new char[50];
		FileReader output=null ;
		FileWriter input= null;
		try {
			output=new FileReader("input.txt");
			int length=output.read(data);
			System.out.println(data);
			output.close();
			input=new FileWriter("output.txt");
			input.write(data,0,length);
			input.flush();
			input.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		

	}

}
