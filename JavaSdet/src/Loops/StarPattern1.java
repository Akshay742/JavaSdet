package Loops;
import java.util.Scanner;

public class StarPattern1 {
	
	int rows;
	Scanner sc = new Scanner(System.in);
	
	public void enter() {
		System.out.println("enter the rows");
		rows= sc.nextInt();
	}
	
	public void display() {
		for(int i=0;i<=rows;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        StarPattern1 obj= new StarPattern1();
        obj.enter();
        obj.display();
	}

}
