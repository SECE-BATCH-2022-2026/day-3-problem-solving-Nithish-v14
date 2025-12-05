import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2=sc.nextLine();
        int c=user.count(s1,s2);
        System.out.println(c);
    }
}
class user
{
	public static int count(String s1,String s2)
	{
		int count=0;
		int l1=s1.length();
		int l2=s2.length();
		if(l1==0 || l2==0)
		{
			return 0;
		}
		int ind=s1.indexOf(s2);
		while(ind!=-1)
		{
			count++;
			ind=s1.indexOf(s2,ind+l2);
		}
		return count;
	}
}
