package ArrayDemo;
import java.util.Arrays;
import java.util.Scanner;
public class TwodArray {
	int[] rollno=new int[3];
	char[] grade=new char[3];
	String[] name=new String[3];
	double eng[]=new double[3];
	double math[]=new double[3];
	double sci[]=new double[3];
	double total[]=new double[3];
	double avg[]=new double[3];
	Scanner s=new Scanner(System.in);
	public void EnterDetails()
	{
for(int i=0;i<3;i++)		
{
System.out.println("Enter Rollno");
rollno[i] = s.nextInt();
System.out.println("Enter Name");
name[i] = s.next();
System.out.println("Enter eng marks");
eng[i]=s.nextDouble();
System.out.println("Enter maths marks");
math[i]=s.nextDouble();
System.out.println("Enter sci marks");
sci[i]=s.nextDouble();
}
	}	
	public void total()
	{
		for(int i=0;i<3;i++)
		{
		
		total[i]=eng[i]+math[i]+sci[i];
		
	}
	}
	public void avg()
	{
		for(int i=0;i<3;i++)
		{
		
		avg[i]=(eng[i]+math[i]+sci[i])/3;
			}
	}
     public void grade()
     {
    	     	for(int i=0;i<3;i++) 
    	{
    	     

    	    if(avg[i]>=80)
    		{
    			grade[i]= 'A';
    		}
    		else if(avg[i]>=60 && avg[i]<80)
    		{
    			grade[i]= 'B';
    		}
    		else if(avg[i]>=40 && avg[i]<60)
    		{
    			grade[i]= 'C';
    		}
    		else
    		{
    			grade[i]='D';
    		}
    		
    	}
     }

    	   public void display()
    	    {
    	    Arrays.sort(name);
 // System.out.println("RollNo\t" +"Name\t"+ "English\t"+"Maths\t"+"Science\t"+"Total\t"+"Average\t"+"Grade");
    	     	for(int i=0;i<3;i++)
    	     	{
    	     	System.out.println(rollno[i]+"\t"+name[i]+"\t"+eng[i]+"\t"+math[i]+"\t"+sci[i]+"\t"+total[i]+"\t"+avg[i]+"\t"+grade[i]);
    	     	}

    	     		}
    	     	
     
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		TwodArray obj=new TwodArray();
obj.EnterDetails();
obj.total();
obj.avg();
obj.grade();
obj.display();
}
}
