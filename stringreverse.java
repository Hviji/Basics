/*
Write a program that takes a string as input and reverses the order of the characters in the string.
*/
import java.util.Scanner;
public class stringreverse
{
	public static void main(String[] args) {
	    		System.out.println("Enter the string");
Scanner sc=new Scanner(System.in);
	    String word=sc.nextLine();
	    	        		System.out.println("The reverse the string is ");

	    for(int i=word.length()-1;i>=0;i--)
	    {
	        		System.out.print(word.charAt(i));

	    }
	}
}

	    
	


