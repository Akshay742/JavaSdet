package Loops;
import java.util.Scanner;

public class IterationDemo {
	int i=1,number,fact=1;
	Scanner sc = new Scanner(System.in);
	
	public void enter() {
		System.out.println("enter the number");
		number= sc.nextInt();
	}
	
	public void display() {
		for(i=1;i<number;i++) {
			fact=fact*i;
		}
		System.out.println(fact*i);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
IterationDemo obj= new IterationDemo();
obj.enter();
obj.display();
	}

}
