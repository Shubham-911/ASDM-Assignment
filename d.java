package day24;

import java.io.Serializable;

public class d implements Serializable {
	String name;
	int salary;
	d(String n,int sal)
	{
		this.name=n;
		this.salary=sal;
	}
	void display()
	{
		System.out.println("Name - '"+this.name+"' Salary - "+this.salary);
	}
	

}
