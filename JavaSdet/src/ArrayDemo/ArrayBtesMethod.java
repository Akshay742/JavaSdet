package ArrayDemo;
import java.util.Arrays;
import java.util.Scanner;

import oOPS.OopsDEmo;

public class ArrayBtesMethod {
	

	int[] rollno=new int[3];
	String[] name=new String[3];
	char []grade=new char[3];
	double[] eng_marks=new double[3];
	double []math_marks=new double[3];
	double[] sci_marks=new double[3];
	double[]total_marks=new double[3];
	double[]average=new double[3];
	Scanner s=new Scanner(System.in);
	public void enterdetails()
	{
		for(int i=0;i<3;i++)
		{
		System.out.println("enter rollno");
		rollno[i]=s.nextInt();
		System.out.println("name");
		name[i]=s.next();

		System.out.println("eng_marks");
		eng_marks[i]=s.nextDouble();
		System.out.println("math_marks");
		math_marks[i]=s.nextDouble();
		System.out.println("sci_marks");
		sci_marks[i]=s.nextDouble();
	}
	}
		public void add()
		{
			for(int i=0;i<3;i++)
			{
				System.out.println("name:"+name[i]);
				System.out.println("rollno:"+rollno[i]);
			total_marks[i]=eng_marks[i]+math_marks[i]+sci_marks[i];
			System.out.println("total_marks"+total_marks[i]);
	}			
	}
		public void average()
		{
			for(int i=0;i<3;i++)
			{
			
			average[i]=total_marks[i]/3;
			System.out.println("average:"+average[i]);
	}
		}
		public void grade()
		{
			for(int i=0;i<3;i++)
			{
			if (average[i]>90)
			{
				grade[i]='A';
			}
			else if(average[i]>85)
			{
				grade[i]='B';
			}
			else 
			{grade[i]='C';
			}
//			else if((average[i]<65)&& (average[i]>=55))
//			{grade[i]='D';
//			}
//			else 
//			{grade[i]='F';
//			}
			System.out.println("grade:"+grade[i]);
			}
	}
		public void st()
		{
			Arrays.sort(name);
			for(int i=0;i<3;i++)
				
			{
				System.out.println(name[i]);
			}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayBtesMethod obj= new ArrayBtesMethod();
		obj.enterdetails();
		obj.add();
		obj.average();
		obj.grade();
		obj.st();
		

	}}


