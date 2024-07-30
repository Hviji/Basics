/*
Write a program that generates a multiplication table for a given number.
*/
import java.util.Scanner;
public class table
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i=0;
System.out.println("Enter a number");
int n=sc.nextInt();
System.out.println("Enter the limit of the table");
int table=sc.nextInt();
    System.out.println("The multipication for the table " +  n +" " +  "is");
for (i=1;i<=table;i++)
{
    System.out.println(i+ "x" + n + "=" +  i*n);
}
//System.out.println(a);
}
}

