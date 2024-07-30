/*
Create a program that asks the user for their name and then greets them by name.
*/
import java.util.Scanner;
public class message
{
	public static void main(String[] args) {
	    Scanner sc=new  Scanner(System.in);
	    System.out.print("Enter a greets");
	    String name=sc.nextLine();
	    
		System.out.println("name of the greets: " + name);
	}
}

