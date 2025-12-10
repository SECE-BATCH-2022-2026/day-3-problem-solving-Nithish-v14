import java.util.*;
class StringSplit
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String inp=sc.nextLine();
		char c=sc.nextLine().charAt(0);
		String []op=UserMainCode.splitString(inp,c);
		for(String s:op)
		{
			System.out.println(s);
		}
	}
}
class UserMainCode
{
	public static String[] splitString(String inp,char c)
	{
		String [] inpair=inp.split(""+c);
		String []op=new String[inpair.length];
		int i=0;
		for(String s:inpair)
		{
			StringBuilder a=new StringBuilder(s);
			a=a.reverse();
			op[i++]=a.toString().toLowerCase();
		}
		return op;
	}
}