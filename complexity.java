import java.util.*;
import java.lang.*;
import java.io.*;
class complexity
{
	public static void main (String[] args) throws java.lang.Exception
	{
		System.out.println("Enter size of array");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int i,j,x=0;
		int a[]=new int[100];
		int b[]=new int[100];
		
		
		for(i=0;i<n;i++)
		{
			a[i]=in.nextInt();
			
		}
		
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				
				if(a[i]==a[j])
				{
					b[x]=a[i];
					x++;
				}

			}
			
		}System.out.println("repet number : ");
		for(i=0;i<x;i++)
		System.out.println(b[i]+" ");
		
		}
}
