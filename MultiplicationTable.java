package basicprogram;
import java.util.Scanner;

public class MultiplicationTable 
{
	
	public static void main(String[] args)
	{
		int i=1,n;
		System.out.println(" Enter Number: ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		for( i=1; i<=50; i++)
		
		System.out.println(n+" * "+i+" = "+i*n);
		
	}
}



