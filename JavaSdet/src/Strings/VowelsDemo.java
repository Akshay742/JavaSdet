package Strings;
import java.util.Scanner;

public class VowelsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="";
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		str= sc.nextLine();
		int vowelcount=0;
		
		for(int i=0;i<str.length();i++) {
			char c= str.charAt(i);
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
				//System.out.println("vowels present");
				System.out.println("vowel"+" "+c+" "+"is at position"+" "+i);
				vowelcount++;
				System.out.println("vowels present");
				
			}
			else {
				System.out.println("vowels absent");
			}
			
		}
		
System.out.println("total no of vowel exist in string "+vowelcount);
	}

}
