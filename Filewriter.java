package File;
import java.io.*;
public class Filewriter {

	public static void main(String[] args) throws Exception {
		FileWriter writer=new FileWriter("3.txt");
		writer.write("To check whether FileWriter creates the new file or not");
		writer.close();
		
	}

}
