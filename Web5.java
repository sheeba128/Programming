//find the missing number in the given array of numbers from 1 to n
import java.util.*;
class Web5
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		int [] arr={1,3,5,7,9,11};
		missingNumber(arr);
	}
	public static void missingNumber(int[] x)
	{
	
		for(int i=0,j=1;i<x.length;i++,j++)
		{
			if(j!=x[i])
			{
				System.out.print(j+" ");
				i--;
			}
		}
	}
}