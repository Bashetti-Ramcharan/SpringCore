package Beans;

import interfaces.pen;

public class Writer 
{
	private pen p;
	
	public Writer(pen p)
	{
		this.p=p;
	}
	
	public void write()
	{
		p.write();
	}
}
