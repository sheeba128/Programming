//Write a program to print the following output form the array
//i/p:[2,7,4,5,6]
/*  
o/p: (2,7),(2,4),(2,5),(2,6),
(7,4),(7,5),(7,6)
(4,5),(4,6),
(5,6)
*/
import java.util.*;
class Web16
{
	public static void main(String[] args)
	{
		int [] arr={2,7,4,5,6};
		int n=arr.length;
		System.out.println("The given array is: "+Arrays.toString(arr));
		printPair(arr,n);
	}
	public static void printPair(int a[],int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				System.out.print("("+a[i]+","+a[j]+")");
			}
			System.out.println();
		}
	}
}