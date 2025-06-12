//Trapping rain Water
import java.util.*;
class Web18
{
	public static void main(String[] args)
	{
		int a[]={0,1,0,2,1,0,1,3,2,1,2,1};
		int res=trappingWater(a);
		System.out.println(res);
	}
	public static int trappingWater(int [] a)
	{
		int n=a.length;
		int left[]=new int[a.length];
		int right[]=new int[a.length];
		 left[0]=a[0];
		int waterTrapped=0;
		 right[n-1]=a[n-1];
		for(int i=1;i<n;i++)
		{
			left[i]=Math.max(left[i-1],a[i]);
		}
		for(int i=n-2;i>=0;i--)
		{
			right[i]=Math.max(right[i+1],a[i]);
		}
		for(int i=0;i<n;i++)
		{
			waterTrapped+=Math.min(left[i],right[i])-a[i];
		}
		return waterTrapped;



	}

}