package controlStatements;
import java.util.Scanner;

public class Factorial {
	int number,i;
	Scanner sc= new Scanner(System.in);
	
	public void enter() {
		System.out.println("enter the number");
		number= sc.nextInt();
		
	}
	
	public void display() {
		for(i=1;i<=10;i++) {
			System.out.println(number+"*"+i+"="+number*i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial obj= new Factorial();
		obj.enter();
		obj.display();
		

	}

}
