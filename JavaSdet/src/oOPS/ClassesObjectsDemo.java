package oOPS;
import java.util.Scanner;

public class ClassesObjectsDemo {
	
	int num1=10,num2=20,res;
	static int num3;
	int num;
	float a;
	String name;
	double b;
	byte c;
	long val;
	char vowel;
	
	public void add() {
		res=num1+num2;
		System.out.println("result is:"+res);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(num3);
	ClassesObjectsDemo oo= new ClassesObjectsDemo();//objects created stored in heap //instance variable
		//oo.add();
	System.out.println(oo.num); //variables in stack memory
	
//		System.out.println(oo.a);
//		System.out.println(oo.name);
//		System.out.println(oo.b);
//		System.out.println(oo.c);
//		System.out.println(oo.val);
//		System.out.println(oo.vowel);
		

	}

}
