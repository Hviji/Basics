/*
15.Write a program that finds the largest and smallest numbers in an array of integers.
*/
public class maxmin
{
	public static void main(String[] args) {
	 	    int a[]={100,200,300};
	 	       int max=a[0];
	    int min=a[0];

	   // System.out.println( "The range of the Double value is = " + Double.MIN_VALUE);
	    	    //System.out.println("The range of the Long value is =  " + Long.MAX_VALUE);

	    for(int i=0;i<a.length;i++)
	 
	    if(a[i]>max)
	    {

	        max=a[i];
	    }
	    
	    else if(a[i]<min)
	    {
	    min=a[i];
	}
	        System.out.println("the largest number is "+ max);
	    
		System.out.println("The smallest number is " + min);
	}
}


