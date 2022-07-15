package basicprogram;
import java.util.Scanner;

public class CountNoOfDigit {
	
	public static void main(String[] args) {
		
		int count=0,num,temp;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		
		temp=num;
		for(;num>0;)
		{
			count++;
			
		}
		
		System.out.println(" Total number of digits of "+ temp +" are " + count );
		
	}

}
