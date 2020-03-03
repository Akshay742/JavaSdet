package Loops;
import java.util.Scanner;


public class StarPattern2 {
	int rows;
	Scanner sc = new Scanner(System.in);
	
	public void enter() {
		System.out.println("enter the rows");
		rows= sc.nextInt();
	}
	
	public void display() {
		for(int i=0;i<rows;i++) {
			//System.out.println(" ");
			for(int j=rows;j>i;j--) {
			
				System.out.print(" ");
			}
		for(int k=0;k<=i;k++) {//star2//for(k=0;k<i*2;k++//star 3
				System.out.print(" *");
			}
			System.out.println("");
		
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StarPattern2 oo= new StarPattern2();
		oo.enter();
		oo.display();

	}

}
