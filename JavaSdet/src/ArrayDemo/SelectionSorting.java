package ArrayDemo;
import java.util.Scanner;

public class SelectionSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] a= {38,52,9,18,6,62,13};
		
		
		int i,j,size;
		int[] arr;
		int temp;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter size of array");
		size= s.nextInt();
		arr= new int[size];
		System.out.println("Enter array elements");
		for( i=0;i<size;i++)
		{
		arr[i]=s.nextInt();
		}
		for( i=0;i<arr.length;i++)
		{
		for(j=i+1;j<arr.length;j++)
		{
		if(arr[i]>arr[j])
		{
		temp= arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		}
		}
		}
		System.out.println("Sorted array is:");
		for( i=0;i<size;i++)
		{
		System.out.print(arr[i]+"\t");
		}
		System.out.println();
System.out.println("Max element is:"+arr[size-1]);
System.out.println("Min element is:"+arr[0]);

	}

}

