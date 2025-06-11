//Right Rotation of an array based on the input of rotation size

import java.util.*;
class Web13
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		int a[]={10,20,30,40,50,60};
		System.out.print("Enter n:");
		int n=sc.nextInt();
		System.out.println(Arrays.toString(a));
		rightRotate(a,n);
	}
	public static void rightRotate(int [] a,int n){
		
		for(int i=0;i<n;i++){
			int first=a[a.length-1];
		for(int j=a.length-1;j>0;j--)
		{
			a[j]=a[j-1];
		}
		
		a[0]=first;
		}
		System.out.println(Arrays.toString(a));
	}
	
}