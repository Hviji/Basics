/*
Write a program that asks the user to enter a number between 1 and 100. If the number is between 1 and 50, print out "The number is in the lower half." If the number is between 51 and 100, print out "The number is in the upper half." If the number is outside the range of 1 to 100, print out "Invalid number."
*/
import java.util.Scanner;
public class invalidnumber
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    	    		System.out.println("Enter the number 1 to 100");

	    int number=sc.nextInt();
	    		//System.out.println("Enter the number 1 to 100");
	    		if(number>=1 && number<=50)
	    		
	    				System.out.println("The number is in the lower half");
	    				
	    					else if(number>=51 && number<=100)
	    					{
	    				System.out.println("The number is in the upper half");
	    				}
	    		
	    				else
	    				{
	    				  	    				System.out.println("Invalid number");
  
	    				}



	    
	}
}

