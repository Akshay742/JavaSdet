package oOPS;

public class ThisDemo {
	int num1;
//	public void acc(int num1) {
//		this.num1=num1;
//		System.out.println(num1);
//	}
	public ThisDemo() {
		System.out.println("constructor calling");
	}
	
	public ThisDemo(int num1) {
		this();
		this.num1=num1;
		System.out.println(num1);
		System.out.println(this.num1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisDemo oo= new ThisDemo(200);
		//oo.acc(100);
	}

}
