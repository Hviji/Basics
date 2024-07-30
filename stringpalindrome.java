/*
Implement a program that determines whether a given string is a palindrome (i.e., it reads the same forwards and backwards).
*/
import java.util.Scanner;
public class stringpalindrome
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the string ");
	    String a=sc.nextLine();
	    String b="";
	    for(int i=a.length()-1;i>=0;i--)
	    {
	        b=b+a.charAt(i);
	        
	        	//	System.out.println(a.charAt(i));

	    }
	    if(b.equals(a))
		System.out.println("it is a palindrome");
			 else
		System.out.println("it is not a  palindrome");
	
	}
}

