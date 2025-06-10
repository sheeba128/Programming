//Find Leaders in an Array
import java.util.*;
class Web8
{
	public static void main(String[] args)
	{
		int [] arr={16, 17, 4, 3, 5, 2};
		leader(arr);
	}
	public static void leader(int x[] )
	{
		int n=x.length;
		int lastelement=x[n-1];
		System.out.print(lastelement+" ");
		for(int i=n-1;i>=0;i--)
		{
			if(lastelement<x[i])
			{
				lastelement=x[i];
				System.out.print(lastelement+" ");
			}
			
		}
	}
}