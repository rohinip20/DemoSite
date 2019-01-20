package stringClass;

public class Compare_2_String {

	public static void main(String[] args)
	{
		
	//compare two string withount case
		
		/*String str1="This is exercise 1";
		String str2="This is exercise 2";
		int result=str1.compareTo(str2);
		
		System.out.println(result);
		if(result<0)
		{
			System.out.println(" "+str1+" is less than"+" "+str2);
		}
		else if(result==0)
		{
			System.out.println(" "+str1+" is equal to"+" "+str2);
		}
		else
		{
			System.out.println(" "+str1+" is greater than"+" "+str2);
		}*/
		
		
		
		// compare two string with case
		
		/*
		String str1="This is exercise 1";
		String str2="This Is exercise 1";
		
        int result=str1.compareToIgnoreCase(str2);
		
		System.out.println(result);
		if(result<0)
		{
			System.out.println(" "+str1+" is less than"+" "+str2);
		}
		else if(result==0)
		{
			System.out.println(" "+str1+" is equal to"+" "+str2);
		}
		else
		{
			System.out.println(" "+str1+" is greater than"+" "+str2);
		}*/
		
		
		
		//compare string to specified character sequence
		
		String str1="example.com";
		String str2="Example.com";
		
		CharSequence cs="example.com";
		
		System.out.println("comparing"+str1 + "and" +cs+": "+str1.contentEquals(cs));
		System.out.println("comparing"+str2 + "and" +cs+": "+str2.contentEquals(cs));
		

	}

}
