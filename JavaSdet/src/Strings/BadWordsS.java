package Strings;
import java.util.Scanner;

public class BadWordsS {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		
		String str= sc.nextLine();
		
		str= str.replace("stupid", "*****").replace("rascals", "*****");
		System.out.println(str);

	}

}
