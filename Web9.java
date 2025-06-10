//finding the majority element by using  Boyer-Moore Voting Algorithm
import java.util.*;
class Web9
{
	public static void main(String[] args)
	{
		int arr[]={2, 3, 1, 2, 3, 3, 3};
		 int res=majorityElement(arr);
		if(res!=1)
		{
			System.out.println("Majority Element: "+res);
		}
		else
		{
			System.out.println("None");
		}
	}
	public static int majorityElement(int [] x)
	{
		int count=0;
		int candidate=-1;
		for(int i=0;i<x.length-1;i++)
		{
			if(count==0)
			{
				candidate=x[i];
				count++;
			}
			else if(x[i]==candidate)
			{
				count++;
			}
			else
			{
				count--;
			}
		}
		 count=0;
		for(int i=0;i<x.length;i++)
		{
			if(x[i]==candidate)
				count++;
		}
		if(count>x.length/2)
			return candidate;
		else
			return -1;
	}
}