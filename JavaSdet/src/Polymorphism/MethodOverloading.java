package Polymorphism;

public class MethodOverloading { //same name, same class, different argument
	//overriding// same name, different class,same arguments
	//public void show(int b, int c) {number of argument
	//0public void show(int b, String a) {//sequence of argument
	public  void show(String  a) {
		System.out.println("akshay");
	}
	public void show(int a) {
		System.out.println("mahajan");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloading ak= new MethodOverloading();
		ak.show(3);
		//ak.show(20, "dsf");
	}

}
