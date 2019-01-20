package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Method_Demo
{

	public static void main(String[] args)
	{
		
   String[] a={"abc","abcd","abcde","ab"};
   List b=Arrays.asList(a);

   Collections.reverse(b);
   System.out.println(b);
 /* Iterator itr=b.iterator();
  while(itr.hasNext())
  {
	 String s= (String )itr.next();
	 System.out.println(s);
  }*/
	}

}
