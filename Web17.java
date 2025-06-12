//Write a program to print the following output form the array
//i/p:[2,7,4,5,6]
/*  
o/p: (6,5),(6,4),(6,7),(2,6),
(5,4),(5,7),(5,2)
(4,7),(4,2),
(7,2)
*/
import java.util.*;
class Web17


{
	public static void main(String[] args)
	{
		int arr[]={2,7,4,5,6};
		int n=arr.length;
		System.out.println(Arrays.toString(arr));
		printPairReverse(arr,n);
	}
	public static void printPairReverse(int[] a,int n)
	{
		for(int i=a.length-1;i>=0;i--)
		{
			for(int j=i-1;j>=0;j--)
			{
				System.out.print("("+a[i]+","+a[j]+")");
			}
			System.out.println();
		}
	}
	
}