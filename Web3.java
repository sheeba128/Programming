//move zeores to the end of array by maintaining the relative ordering of the non-zero elements
import java.util.*;
class Web3
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		int [] arr={1,0,4,0,6,0,0,8,7,9};
		int res[]=moveZero(arr);
		System.out.println(Arrays.toString(res));
	
	}
	public static int[] moveZero(int []x)
	{
		int index=0;
		for(int i=0;i<x.length;i++)
		{
			if(x[i]!=0)
			{
				x[index]=x[i];
				index++;
			}
		}
		while(index<x.length)
		{
			x[index]=0;
			index++;
		}
		return x;
	}
}