package controlStatements;
import java.util.Scanner;

public class SwitchDays {
	int choice;
	Scanner sc = new Scanner(System.in);
	
	public void enter() {
		System.out.println("enter the choice");
		choice= sc.nextInt();
	}
	public void display() {
		switch(choice) {
		case 1:
			System.out.println("Monday");
			break;
			
		case 2:
			System.out.println("Tuesday");
			break;
			
		case 3:
			System.out.println("Wednesday");
			break;
		
		case 4:
			System.out.println("thursday");
			break;
			
			default:
				System.out.println("wrong value");
				break;
				}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwitchDays obj= new SwitchDays();
		obj.enter();
		obj.display();
	}

}
