package basicprogram;
import java.util.Scanner;
public class PrintingStarPattern2 {

	public static void main(String[] args) {
		int i,j,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row number :");
		n=sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				//System.out.print(j+"");
				System.out.print("*");
			}
			System.out.println();
		}
		
		

	}

}
