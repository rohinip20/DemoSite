package collection;

import java.util.HashMap;
import java.util.Map;

public class Demo 
{
	{
		System.out.println("instance block 2");
	}
	Demo(int a,int b)
	{
		System.out.println("dhf");
		{
			System.out.println("instance block");
		}
		System.out.println("addition="+a+b);
	}

	public static void main(String[] args) 
	{
		Demo d=new Demo(10,10);
		Demo d1=new Demo(20,30);
	}

}
