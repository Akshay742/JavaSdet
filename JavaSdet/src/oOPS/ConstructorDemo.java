package oOPS;

public class ConstructorDemo {
	int empid;
	String name;
	ConstructorDemo(String name,int empid){
		//System.out.println("no arg constructor");
	this.name=name;
	this.empid=empid;
	}
   public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemo oo= new ConstructorDemo("akshay",2);
		System.out.println(oo.name+" "+oo.empid);//call krega no arg nu jide ch app krde aapa
		//System.out.println(oo.i+" "+oo.s);//default constructor provides default value jdo apne aap hove
		}
}
