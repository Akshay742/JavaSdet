package ArrayDemo;
import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {
		int i,size;
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
	int max=arr[0];
		for(i=0;i<size;i++) {
			if(max<arr[i]) {
				max=arr[i];
				}
			}
	
		System.out.println(max);
		int min=arr[0];
		for(i=0;i<size;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println(min);
		// TODO Auto-generated method stub
}
}
