package basicprogram;
import java.util.Scanner;

public class RelationalOperator {
	
	public static void main(String[] args) {
		int m1,m2,m3,m4,m5,total,avg;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 marks:");
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();
		m4=sc.nextInt();
		m5=sc.nextInt();
		
		total=m1+m2+m3+m4+m5;
		avg=total/5;
		System.out.println("Total: " +total+ " "+"  Average: "+ avg );
		System.out.println("Grade:");
		
		if(avg>=90)
			System.out.println("A+");
		else if(avg>=80)
			System.out.println("A");
		else if(avg>=60)
			System.out.println("B");
		else if(avg>=40)
			System.out.println("C");
		else
			System.out.println("D");
		
			
			
		
		
	
	}
	

}
