/*
Write a program that calculates the sum of two numbers and prints the result.
*/
import java.util.Scanner;
public class sumoftwonum
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the 1st number");
int num1=sc.nextInt();
System.out.println("Enter the 2nd number");
int num2=sc.nextInt();
//System.out.println("Enter the 2nd number");
int num=num1+num2;
//int a =90;
//int b=79;
//int c=a+b;
System.out.println("sum of two number is " + num);
}
}
