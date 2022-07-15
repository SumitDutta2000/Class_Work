package basicprogram;

import java.util.Scanner;

public class PrintingStarpattern1 {

	public static void main(String[] args) {
		int i,j,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows number:");
		n=sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
			for(j=n;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
