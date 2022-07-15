package basicprogram;
import java.util.Scanner;
public class PerfectNumber {
	public static void main(String[] args) {
		int number,i,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to check perfect or not?");
		number=sc.nextInt();
		
		for(i=1;i<number;i++)
		{
			if(number%i==0)
			{
				sum=sum+i;
			}
		}
		if(number==sum)
			System.out.println(number+ " is a perfect number ");
		else
			System.out.println(number+ " is not a perfect number ");
	}

	
}
