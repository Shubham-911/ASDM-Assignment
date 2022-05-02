package day24;
import java.io.*;
public class dd {

	public static void main(String[] args) throws Exception{
		d d1=new d("Shubham", 430000);
		FileOutputStream f=new FileOutputStream("d.dat");
		ObjectOutputStream o=new ObjectOutputStream(f);
		o.writeObject(d1);//object--to binary-then store to file
		//also call writestreamheader in the background and write header 
		//in the record
		FileInputStream i=new FileInputStream("d.dat");
		ObjectInputStream oi=new ObjectInputStream(i);
		d k=(d)oi.readObject();
		k.display();
	}

}
