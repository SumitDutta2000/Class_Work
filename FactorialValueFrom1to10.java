package basicprogram;

public class FactorialValueFrom1to10 {
	public static void main(String[] args) {
		int fact=1;
		for(int i=1;i<=10;i++)
		{
			fact=fact*i;
			System.out.println("The factorial of"+i+" is :"+fact);
		}
	}

}
