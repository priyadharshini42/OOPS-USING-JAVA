import java.util.Scanner;
public class findsum {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int num=obj.nextInt();
		int i,flag=0;
		int a[]=new int [num];
		for(i=0;i<num;i++)
		{
			a[i]=obj.nextInt();
		}
		int sum=obj.nextInt();
		for(i=0;i<num;i++)
		{
			if(a[i]+a[i+1]==sum)
			{
				flag=1;
			}
		}
		
if(flag==1)
{
	System.out.println("true");
}
else
{
	System.out.println("false");
}
}
}
