//Find the second largest element in the array
import java.util.*;
class Web1
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		int [] arr={10,20,40,3,2,1};
		System.out.println(Arrays.toString(arr));
		System.out.print("Enter the nth element:");
		int n=sc.nextInt();
		nthLargest(arr,n);
		
	}
	public static void nthLargest(int[] x,int n)
	{
		for(int i=0;i<x.length-1;i++)
		{
			for(int j=i+1;j<x.length;j++)
			{
			if(x[i]>x[j])
			{
				int temp=x[i];
				x[i]=x[j];
				x[j]=temp;
			}
			}
		}
		System.out.println(x[x.length-n]);
	}
}