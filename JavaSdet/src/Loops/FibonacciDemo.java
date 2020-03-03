package Loops;
import java.util.Scanner;

public class FibonacciDemo {
	int num1=0, num2=1, num3,number;
	Scanner sc = new Scanner(System.in);
	
	public void enter() {
		System.out.println("enter the number");
		number= sc.nextInt();
	}
	
	public void display() {
		for(int i=1;i<=number;i++) {
			num3=num1+num2;
			num1=num2;
			num2=num3;
			System.out.println(num1+" ");
			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibonacciDemo obj= new FibonacciDemo();
		obj.enter();
		obj.display();
		

	}

}
