package oOPS;
import java.io.*;
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;

public class BufferedReaderDemo {
	
	int num;
	String name;
	
	public void input() throws IOException {
		InputStreamReader rd= new InputStreamReader(System.in);
		BufferedReader bd = new BufferedReader(rd);
		System.out.println("enter name");
		name=bd.readLine();
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReaderDemo oo= new BufferedReaderDemo();
		oo.input();
	}

}
