package controlStatements;
import java.util.Scanner;

public class OddEven {
	int num1;
	Scanner sc = new Scanner(System.in);
	
	public void enter() {
		System.out.println("enter the num1");
		num1= sc.nextInt();
		
		}
	
	public void display() {
		if(num1%2==0) {
			System.out.println("number is even");
		}
		else {
			System.out.println("number is odd");
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OddEven obj = new OddEven();
		obj.enter();
		obj.display();

	}

}
