import java.io.FileWriter;
import java.io.IOException;
public class FileWriterDemo {

	public static void main(String[] args) {
		String data="My name is Devika";
		FileWriter input=null;
		try {
			input= new FileWriter("input.txt");
			input.write(data);
			input.flush();
			input.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
