package basicprogram;

public class ArmstrongNumberBetween1to500 {
	public static void main(String[] args) 
	{
		int number, n, total=0;
		System.out.println("Armstrong number berween 1 to 500 :  ");
		
		for(int a=1;a<=500;a++)
		{
			number=a;
			while(number>0)
			{
				n=number%10;
				total=total+(n*n*n);
				number=number/10;
				
			}
			if(total==a)
			{
				System.out.println(a+ " ");
				
			}
			total=0;
				
		}
			
	}

}
