import java.util.*;
import java.io.*;
public class onlyones {
		public static void main (String[] args) throws IOException
		{
			System.out.println("Enter size of array");
			Scanner in=new Scanner(System.in);
			int n=in.nextInt();
			int i,j=0,x=0,a1=0,b1=0;
			int a[]=new int[100];int b[]=new int[100];
			
		
			System.out.println("Enter element in the array");
			for(i=0;i<n;i++)
			{
				a[i]=in.nextInt();
				
			}
			
			
			for(i=0;i<n;i++)
			{
				for(j=0;j<n;j++)	
				{
					
					int xx=a[i]-a[j];
					if(xx==1 || xx== -1)
					{
						a1=a[i];
						b1=a[j];
						break;
					}
				}
				
				
				
			}
				
			
				System.out.println("the elements are :   "+a1+" & "+b1);
			
			
	
		
			}
	}
