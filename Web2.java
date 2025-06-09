import java.util.Scanner;//reverse an array without using extra space
class Web2
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.print("Enter the array size: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter arr["+i+"]: ");
			arr[i]=sc.nextInt();
		}
		int res[] =reverseArray(arr);
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i]+" ");
		}
	}
	public static int[] reverseArray(int [] x)
	{
		int l=0,h=x.length-1;
		while(l<h)
		{
			int temp=x[l];
			x[l]=x[h];
			x[h]=temp;
			l++;
			h--;
		}
		return x;
	}
}