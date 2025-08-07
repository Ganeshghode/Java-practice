import java.util.Scanner;
class Atm
{
	public static void main(String args[])
	{
		int pin =1234,balance=12000;
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your pin");
		int pincode = sc.nextInt();
		if(pincode == pin)
		{	
			System.out.println("Press c for credit");
			System.out.println("Press d for debit");
			System.out.println("Press b for check balance");
			ch = sc.next().charAt(0);
			if(ch=='c' || ch=='C')
			{
				System.out.println("Enter the credit amount");
				balance+=sc.nextInt();
				System.out.println("After credit your balance is "+balance);			
			}
			else
			{
				if(ch=='d' || ch=='D')
				{
					System.out.println("Enter the debit amount");
					balance-=sc.nextInt();
					System.out.println("After debit your balance is "+balance);			
				}
				else
				{
					if(ch=='b' || ch=='B')
					{
					
						System.out.println("Your current balance is "+balance);			
					}
				}
			}
		}
		else
		{
			System.out.println("Wrong pin");
			
		}
	}
}