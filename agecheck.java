/*
Create a program that asks the user to enter their age. If the user is 18 or older, print out "You are an adult." Otherwise, print out "You are not
 yet an adult."
*/
import java.util.Scanner;
public class agecheck
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter your age");
	    int age =sc.nextInt();
	    if(age>=18)
	    {
	        	    	    System.out.print("You are an adult");
	        	    	   

	    }
	    else
	    {
	    	    	    System.out.print("you are not yet an adult");
	    }

	    
	    
	    
	}
}

