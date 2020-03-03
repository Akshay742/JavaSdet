package ArrayDemo;
import java.util.Scanner;

public class OnedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] rollno=new int[2];
		String[] Name= new String[2];
		int[] Eng= new int[2];
		int[] Hindi= new int[2];
		String[] grade= new String[2];
		int[] avg= new int[2];
		Scanner sc= new Scanner(System.in);
		
		for(int i=0;i<2;i++) {
			System.out.println("enter the rollno");
			rollno[i]= sc.nextInt();
			System.out.println("enter the name");
			Name[i]=sc.next();
			System.out.println("enter eng marks");
			Eng[i]=sc.nextInt();
			System.out.println("enter hindi marks");
			Hindi[i]=sc.nextInt();
			
			avg[i]=(Eng[i]+Hindi[i])/2;
			
			if(avg[i]>=80)
			{
				grade[i]= "Excellent";
			}
			else if(avg[i]>=60 && avg[i]<80)
			{
				grade[i]= "Very Good";
			}
			else if(avg[i]>=40 && avg[i]<60)
			{
				grade[i]= "Good";
			}
			else
			{
				grade[i]="Average";
			}
		}
		

System.out.println("RollNo\t"+"Name\t"+"English\t"+"Hindi\t"+"Average\t"+"Grade");

for(int i=0;i<2;i++) {

	System.out.println(rollno[i]+"\t"+Name[i]+"\t"+Eng[i]+"\t"+Hindi[i]+"\t"+avg[i]+"\t"+grade[i]);
}

	}

}
