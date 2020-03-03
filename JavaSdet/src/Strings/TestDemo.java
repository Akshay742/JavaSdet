package Strings;
public class TestDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name=" abc ";
	    String name1=" abc ";
		String email="abc@gmail.com";
		String pass=" abc123";
		System.out.println(email.length());
		System.out.println(name.isEmpty());
		System.out.println(pass.trim());
		int i=name1.length();
		//if(i==0)
		if(name1.trim().length()==0) {
			System.out.println("name is empty");
		}
		else {
			System.out.println("valid name");
		}
	}
}
