import java.util.*;
import java.lang.*;
import java.io.*;
class unique1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		System.out.println("Enter size of array");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int i,j,x=0,y=0;
		int a[]=new int[100];
		int b[]=new int[100];
	
		
		for(i=0;i<n;i++)
		{
			a[i]=in.nextInt();
			
		}
		
		for(i=0;i<n;i++)
		{int flag=0;
			for(j=i+1;j<n;j++)
			{
				
				if(a[i]==a[j])
				{
					flag=1;
				}

			}
			if(flag==1);
			else
			{b[x]=a[i];
			x++;
			break;}
			
		}System.out.println("unique number : ");
		for(i=0;i<x;i++)
		System.out.println(b[i]+" ");
		
		}
}
