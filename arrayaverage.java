/*
13.Create a program that reads in a list  numbers from the user and then calculates the average of those numbers.of
*/
import java.util.Scanner;
public class arrayaverage
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    		System.out.println("Enter the array length");
	    		int len=sc.nextInt();
	    		int a[]=new int[len];
	    			    	    double avg=0;
	    	    int sum=0;
	    	    int i=0;
	    	    		System.out.println("Enter the array value");

	    	    for(i=0;i<a.length;i++)
	    	    {
	    	     a[i]=sc.nextInt();
	    	    

	    	    sum=sum+a[i];
	    	    avg=sum/2;
	    	    }
	    	    
	    		

		System.out.println("The average of sum = " + avg);
	}
}

