/*
Write a program that asks the user to enter a temperature in Celsius and converts it to Fahrenheit. The formula for converting Celsius to Fahrenheit is F = (C * 9/5) + 32.
*/
import java.util.Scanner;
public class temperature
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    		System.out.println("Enter the temperature value");
	    		double celusius=sc.nextDouble();
	    		double fahrenheit=(celusius*9/5)+32;
	    				System.out.println("celusius into fahrenheit : " + fahrenheit);
	}
}

