package stringBuffer;

public class Compare_2_String {

	public static void main(String[] args) 
	{
		//compare two string to specified string buffer
		
		String str1="example.com";
		String str2="Example.com";
		StringBuffer sb=new StringBuffer(str1);
		
		System.out.println("comparing"+str1 + "and" +sb+": "+str1.contentEquals(sb));
		System.out.println("comparing"+str2 + "and" +sb+": "+str2.contentEquals(sb));
		

	}

}
