import java.util.*;
import java.io.*;
public class findcontinuity {
		public static void main (String[] args) throws IOException
		{
			System.out.println("Enter size of array");
			Scanner in=new Scanner(System.in);
			int n=in.nextInt();
			int i,j,x=0;
			int a[]=new int[100];int b[]=new int[100];
			
		
			System.out.println("Enter element in the array");
			for(i=0;i<n;i++)
			{
				a[i]=in.nextInt();
				
			}
			
			
			for(i=0;i<n-2;i++)
			{
				int a1,b1,c1;
				a1=a[i];b1=a[i+1];c1=a[i+2];
				if(a1+b1 ==c1)
				{
					
				 x=1;
						System.out.println("the Three elements are : "+a1+" "+b1+" "+c1);
						break;
					
				}
				
				
				
			}
				
			if(x==0)
			{
				System.out.println("no one can present");
			}
			
	
		
			}
	}
