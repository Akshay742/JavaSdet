package interfaces;

import abstractionDemo.FirstbClass;

public class StudentDemo extends FirstbClass implements  InterfaceDiscount{//StudentDetails,InterfaceDiscount{
	int rollno;
	String name, course;
	double fees;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDemo oo= new StudentDemo();
		oo.perdet();
		oo.coursedate();
		oo.fees();
		oo.newMethod();
		oo.discount();
		InterfaceDiscount.dis();//class belong to interface in interface calling static concrete
		oo.kuchbhi(); //calling default concrete
		

	}

	@Override
	public void perdet() {
		// TODO Auto-generated method stub
	System.out.println("enter the name");
	name= sc.next();
	
	System.out.println("enter the rollno");
	rollno= sc.nextInt();
	
System.out.println(a);
	}

	@Override
	public void coursedate() {
		// TODO Auto-generated method stub
		System.out.println("enter the name of course");
		course= sc.next();
		
	}

	@Override
	public void fees() {
		// TODO Auto-generated method stub
		System.out.println("enter the details of fees");
		fees=sc.nextDouble();
		
	}
	public void newMethod() {
		System.out.println("method of this class");
	}

	@Override
	public void discount() {
		// TODO Auto-generated method stub
		System.out.println("discount");
		
	}

}
