package basicprogram;
import java.util.Scanner;

public class AmstrongNumber {
	public static void main(String[] args) {
		
		int number,count=0,sum=0,rem,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check armstrong or not.......!");
		number=sc.nextInt();
		
		//store actual number for future use
		temp=number;
		
		//count no of digits 
		while(number>0) //while(number!=0)
		{
			count++;
			number=number/10;
			
		}
		
		//again assign value from temp to number as number becomes zero
		number=temp;
		
		//calculate Armstrong number
		
		while(number>0)//0>f
		{
			rem=number%10;
			sum+=Math.pow(rem, count);
			number=number/10;
		}
		//checking actual number is matched with sum or  not
		
		if(sum==temp)
			System.out.println(temp+": is an armstrong number. ");
		else
				System.out.println(temp+": is not an armstrong number. ");
	}
	
	
}
