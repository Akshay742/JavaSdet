package interfaces;

public interface InterfaceDiscount extends StudentDetails{
	 void discount(); 
	 static void dis() {//concrete method
System.out.println("discount offer");
}
	 default void kuchbhi() {
		 System.out.println("kuch v");
	 }
}
