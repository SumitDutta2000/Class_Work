package basicprogram;
import java.util.Scanner;
public class SumOfNaturalNumber {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number.....!");
		num=sc.nextInt();
		
		int sum= num *( num +1) / 2;
		
		System.out.println("The sum of this natural number is : " +sum);
		
		
		
	}

}
