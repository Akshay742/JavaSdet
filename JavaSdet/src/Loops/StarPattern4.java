package Loops;
import java.util.Scanner;


public class StarPattern4 {
	int rows,count=0;
	Scanner sc = new Scanner(System.in);
	
	public void enter() {
		System.out.println("enter the rows");
		rows= sc.nextInt();
	}
	
	public void display() {
		
		while(count<3) {
			
		
		for(int i=0;i<rows;i++) {
			for(int j=rows;j>i;j--) {
			System.out.print(" ");
			}
		for(int k=0;k<i;k++) {
				System.out.print(" *");
			}
			System.out.println("");
		
		}
	
	
	for(int i = rows;i>0;i--) {
		for(int j =rows;j>i;j--) {
			System.out.print(" ");
		}
		for(int k=0;k<i;k++) {
			System.out.print(" *");
		}
		System.out.println("");
	}
	count++;
	}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StarPattern4 oo= new StarPattern4();
		oo.enter();
		oo.display();


	}

}
