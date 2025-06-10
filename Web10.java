//find the first repeating elemet not by value but by position
class Web10
{
	public static void main(String[] args)
	{
		int a[]={2,10,3,4,2,2,3,5,6};
		int res=repeatingElement(a);
		if(res!=-1)
			System.out.println("Repeating Element: "+res);
		else
			System.out.println("No repeating element");
	}
	public static int repeatingElement(int x[])
	{
		int min=x.length;
		for(int i=0;i<x.length;i++)
		{
			for(int j=i+1;j<x.length;j++)
			{
				if(x[i]==x[j])
				{
					if(i<min)
					{
						min=i;
					}
					break;
				}
			}
		}
		if(min==x.length)
			return -1;
		else
			return x[min];
	}
}