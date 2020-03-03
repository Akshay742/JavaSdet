package oOPS;

public class ThisDemoYoutube {
	int num;
	public void acc(int num) {
		this.num=num;// j this na lgaayiye fr default value chukda
	}
	public void display() {
		System.out.println(num);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisDemoYoutube oo= new ThisDemoYoutube();
		oo.acc(100);
		oo.display();
	}

}
