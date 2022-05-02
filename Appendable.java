package day24;

import java.io.*;
import java.io.ObjectOutputStream;

public class Appendable extends ObjectOutputStream{

	protected Appendable(OutputStream x) throws Exception 
	{
		super(x);
	}
	protected void writeStreamHeader()
	{ }
}
