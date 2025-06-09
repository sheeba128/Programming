//check if an array is sorted in increasing order
import java .util.*;
class Web4
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		int arr[]={6,2,3,4,5};
		boolean res=checkIncreased(arr);
		System.out.println(res);
	}
	public static boolean checkIncreased(int x[])
	{
		for(int i=0;i<x.length-1;i++)
		{
			if(x[i]>x[i+1])
				return false;
		}
		return true;
	}
}