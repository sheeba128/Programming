//Sunrise view ofBuildings
class Web19
{
	public static void main(String[] args)
	{
		int [] arr={7, 4, 8, 2, 9};
		int count=sunRise(arr);
		System.out.println(count);
	}
	public static int sunRise(int [] a)
	{
		int count=0;
		int max=a[1];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				count++;
				max=a[i];
			}
		}
		return count;
	}
}