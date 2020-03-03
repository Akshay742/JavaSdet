package ArrayDemo;
import java.util.Scanner;

public class StartArray {
	int[] a= new int[3];
	Scanner sc= new Scanner(System.in);
	
	public void enter() {
		System.out.println("enter the numbers");
		 for(int i=0;i<a.length;i++) {
			 //System.out.println("enter the numbers");
			 a[i]=sc.nextInt();
			
		 }
	}
	
	public void display() {
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StartArray oo= new StartArray();
		oo.enter();
		oo.display();
		
		
		

	}

}
