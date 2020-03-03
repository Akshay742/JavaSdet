package abstractionDemo;

public class FirstaClass extends FirstDemo{ 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FirstaClass oo= new FirstaClass();
oo.personal();
oo.eat();
oo.drink();

	}

	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println("deer eats veg");
		System.out.println(a);
		//drink();
	}
	void personal() {
		System.out.println("personal detail");
		//drink();
	}

}
