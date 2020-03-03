package oOPS;

public class StaticDemo {
	 static int a=10;
	 int empid;
	 String name;
	static String company="btes";
	 
	 public void dis() {
		 System.out.println(empid+" "+name+" "+company);
	 }
	 public StaticDemo(int empid,String name) {//String company) {
		 this.empid=empid;
		 this.name=name;
		 //this.company=company;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(StaticDemo.a);//belong to class taan class toh call kraya
		StaticDemo oo= new StaticDemo(101,"akshay");
		StaticDemo o1= new StaticDemo(102,"mahajan");
		oo.dis();
		o1.dis();
		
		

	}

}
