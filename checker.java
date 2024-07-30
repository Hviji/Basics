/*
Write a program that asks the user to enter a number and then prints out whether the number is positive, negative, or zero.
*/
import java.util.Scanner;
public class checker
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter the number  ");
	    int num1=sc.nextInt();
	    	    //System.out.print("Enter the number2");
	    	    //int num2=sc.nextInt();
	    	    if(num1>0)
	    	    {
	    	        	    	    System.out.print("Postive");

	    	        
	    	    }
	    	    else if(num1<0)
	    	    {
	    	    	    	    System.out.print("negative");
	    	    }
	    	    else
	    	    {
	    	        	    	    System.out.print("Zero");

	    	    }

	    	    
	    	    

	    
	}
}

