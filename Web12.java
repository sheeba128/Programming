//Given an unsorted array, find the length of the longest consecutive numbers (regardless of order).
import java.util.*;
class Web12
{
	public static void main(String[] args)
	{
		int a[]={100,4,3,2,1,200};
		longestConsecutiveSequence(a);
	}
	public static void longestConsecutiveSequence(int [] a)
	{
		
		Arrays.sort(a);
		int curLen=1;
		int maxLen=1;
		int maxStart=a[0];
		int start=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]==a[i-1])
			{
				continue;
			}
			else if(a[i]==a[i-1]+1)
			{
				curLen++;
				
			}
			else
			{
				start=a[i];
				curLen=1;
				
			}
			if(curLen>maxLen)                                                   
			{
				maxLen=curLen;
				maxStart=start;
			}
		}
		for(int i=0;i<maxLen;i++)
		{
			System.out.print((maxStart+i)+" ");
		}
		System.out.println();
		System.out.println(maxLen);
	}
}