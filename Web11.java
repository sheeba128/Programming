// Count Frequency of All Elements from 1 to n
 //Given n integers in range 1 to n, find frequency of each number using O(1) space if allowed to modify the array.
/*
import java.util.*;
class Web11
{
	public static void main(String[] args)
	{
		int arr[]={2, 3, 3, 2, 5	};
		System.out.println(Arrays.toString(arr));
		frequencyOfElements(arr);
	}
	public static void frequencyOfElements(int arr[])
	{
		int k=Integer.MIN_VALUE;
		for(int i:arr)
		{
			k=Math.max(i,k);
		}
		int b[]=new int[k+1];  //uses extra space
		for(int i=0;i<arr.length;i++)
		{
			b[arr[i]]++;
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.println(i+":"+b[i]);
		}
	}
}*/
import java.util.*;
class Web11
{
	public static void main(String[] args)
	{
		int arr[]={2, 3, 3, 2, 5};
		frequencyOfElements(arr);
	}
	public static void frequencyOfElements(int a[])
	{
		int n=a.length;
		for(int i=0;i<n;i++)
		{
			a[i]=a[i]-1;
		}
		for(int i=0;i<n;i++)
		{
			int index=0;
			index=a[i]%5;
			a[index]+=n;
		}
		for(int i=0;i<n;i++)
		{
			int freq=a[i]/5;
			System.out.println((i+1)+":"+freq);
		}
	}
}