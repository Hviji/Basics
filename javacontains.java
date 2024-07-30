/*
Create a program that asks the user to enter a string and then checks whether the string contains the word "Java". If it does, print out "The string contains Java." If it doesn't, print out "The string does not contain Java."
*/
import java.util.Scanner;

public class javacontains
{
    static int count,j,i;
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter a string: ");
	    String user = sc.nextLine();
	    String word = "java";
	    int a = user.length();
	    int b  = word.length();
	    for(i=0;i<a;i++)
	    {
	        while(j<b)
	        {
	            if(word.charAt(j) == user.charAt(i))
	            {
	            count++;
	            j++;
	            i++;
	            continue;
	            }
	            if((int) user.charAt(i) == 32)
	            {
	                count = 0;
	                j=0;
	            }
	            
	                count = 0;
	                j=0;
	            break;
	        }
	        if(count==b)
	        break;
	    }
	    if(count == b)
		System.out.println("String contains "+ word);
	    else
		System.out.println("String contains doesn't "+ word);
	}
}

