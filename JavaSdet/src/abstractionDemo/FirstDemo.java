package abstractionDemo;

abstract class FirstDemo {
	int a;
	abstract void eat(); //abstract method
		
	void drink() {//non abstract or concrete method
		System.out.println("animal are *****");
	}
	

	public static void main(String[] args) {// abstract classes are those classes for which we cant be able to create a object.
		//variables and methods are default public
		// classes cant contain abstract as well as non abstract.
			//mainly used fr code reusability because in this we define the method in parent class rather than 
			//defining in over and over again in subclasses
		// TODO Auto-generated method stub

	}

}
