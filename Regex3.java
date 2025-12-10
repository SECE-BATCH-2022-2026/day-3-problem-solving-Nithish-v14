import java.util.*;
class Regex3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(UserMainCode.regex3(s));
	}
}
class UserMainCode 
{
	public static boolean regex3(String inp){
		return inp.matches("(^[2][1-9]$)|(^[3][0-9]$)|(^[4][0-9]$)");
	}
}