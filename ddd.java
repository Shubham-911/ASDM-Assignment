package day24;
import java.util.*;
import java.io.*;
public class ddd {

	public static void main(String[] args)  {
		try {
		Scanner sc=new Scanner(System.in);
		File f1=new File("e.dat");
		int len =(int)f1.length();
		System.out.println("Enter the Name and Salary");
		String n=sc.nextLine();
		int s=sc.nextInt();
		d d2=new d(n,s);
		if(len>0)
		{
		FileOutputStream f=new FileOutputStream("e.dat",true);
		Appendable a=new Appendable(f);
		a.writeObject(d2);
		}else
		{
		FileOutputStream f11=new FileOutputStream("e.dat",true);
		ObjectOutputStream o=new ObjectOutputStream(f11);
		o.writeObject(d2);
	}
	FileInputStream fi=new FileInputStream("e.dat");
	ObjectInputStream ois=new ObjectInputStream(fi);
	d d3;
	do {
		d3=(d)ois.readObject();
		d3.display();
	}while(d3!=null);
	}catch(Exception e)
	{
		
	}
}
}
