package Strings;
//import java.util.Scanner;
 
public class ReverseStringPositionUnchanged {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        //System.out.print("Original string : ");
 
        //String originalStr = scanner.next();
        //scanner.close();
    	String str= "Akshay mahajan";
 
        String words[] = str.split("\\s");
        String reversedString = "";
 
        for (int i = 0; i < words.length; i++) 
        {
            String word = words[i];
            String reverseWord = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                reverseWord = reverseWord + word.charAt(j);
            }
            reversedString = reversedString + reverseWord + " ";
        }
 
        // Displaying the string after reverse
        System.out.print("Reversed string : " + reversedString);
    }
}