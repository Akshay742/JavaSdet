package controlStatements;
import java.util.Scanner;

public class LeapYear {
	int year;
	Scanner sc= new Scanner(System.in);
	
	public void enter() {
		System.out.println("enter the year");
		year= sc.nextInt();
	}
	
	public void display() {
		if((year%400==0) || (year%4==0 && year%100!=0)){
			System.out.println("year is leap");
			}
		else {
			System.out.println("year is not leap");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeapYear obj= new LeapYear();
		obj.enter();
		obj.display();

	}

}
