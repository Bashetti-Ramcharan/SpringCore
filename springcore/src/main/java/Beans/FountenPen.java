package Beans;

import interfaces.Ink;
import interfaces.pen;

public class FountenPen implements pen
{

	private Ink in;
	
	public FountenPen(Ink i)
	{
		this.in=i;
		
	}
	public void write() 
	{
		System.out.println("Writing with "+in.getColour()+ "ink of "+in.getBrandName()+"brand");
		
	}

}
