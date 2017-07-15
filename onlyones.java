package sample;

import java.util.*;
import java.io.*;
public class onlyones {
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
			
			
			for(i=0;i<n;i++)
			{int flag=0;
				for(j=0;j<n;j++)
				{
					
					if(a[i]==a[j])
					{
						flag++;
					}

				}
				if(flag==1)
				{b[x]=a[i];
				break;}
				
			}
				System.out.println("Integer appers only ones : "+b[0]);
			
	
		
			}
	}


