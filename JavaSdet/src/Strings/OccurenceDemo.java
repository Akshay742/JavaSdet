package Strings;
import java.util.Scanner;

public class OccurenceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		
		String str= sc.nextLine();
		
		int count=0;
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(c=='a') {
				System.out.println("a is at position"+" "+i);
				count++;
			}
		}
		System.out.println("total no of a exist in string"+" "+count);
		

	}

}

