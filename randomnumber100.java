/*
Create a program that generates a random number between 1 and 100 and asks the user to guess the number. Provide feedback to the user if their guess is too high or too low, and keep track of how many guesses it takes them to get the correct answer.
*/
import java.util.Scanner;
import java.util.Random;

public class randomnumber100
{
    public static void main(String args[])
    {
    int ans,guess;
    int max=10;
    int count=0;
    Scanner sc=new Scanner(System.in);
    		    System.out.println("Enter the value between 1 to 100");

    max=sc.nextInt();
    Random rand=new Random();
    boolean correct=false;
    ans=rand.nextInt(max)+1;
    while(!correct)
    {
                		System.out.println("guess number");
                		guess=sc.nextInt();

    
        if(ans<0)
        {
        		System.out.println("Please enter the positive number");
        }
    
    else if(guess>ans)
    
    {
		System.out.println("Too high");
		count++;
    }
    
		else if(guess<ans)
		
		{
		    		System.out.println("Too low");
		count++;

		}
		else
		{
		    		System.out.println("correct");
		    		correct=true;
		    		break;
		    		//for (int i=1;i<=guess;i++)

    //i=0;

		}

    }
    		    System.out.println("How many times tracking in the correct number =" +   count);

    }

        
    
	
	
}

