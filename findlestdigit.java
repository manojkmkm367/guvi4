import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class findlestdigit {
	public static void main (String[] args) throws java.lang.Exception
	{
		int num,number = 0,len,i,j,sum=0,div=10;
    Scanner in=new Scanner(System.in);
    System.out.println("ENTER THE INTEGER");
     String s=in.nextLine();
     len=s.length();
      num=Integer.parseInt(s);
     ArrayList<Integer> a=new ArrayList<Integer>();
 
     System.out.println("Enter the digit you want to delete");
     int del=in.nextInt();
     
     
     number=num; 
     for(i=0;number>0;i++)
     {
    	 div=number%10;
    	 a.add(div);
    	 number=number/10;
    	 System.out.println(number+".."+div);
     }
     
     
     for(j=0;j<del;j++)
     {int no=0;
    	 int noo=0;
    	int max=a.get(0);
    	 for(int x:a)
    	 {
    		noo++;
    		 if(max < x)
    		 {
    			 max=x;
    			no=noo-1;	
    		 }
    		    			 
    	 }
    	 a.remove(no);
     }
     
     
     
     int size=a.size();
     for(i=size;i>0;i--)
    	 System.out.print(a.get(i-1));

}
}
