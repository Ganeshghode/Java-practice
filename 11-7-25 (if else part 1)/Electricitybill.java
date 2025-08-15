//WAP to calculate electricity bill where unit price and total consumption will be assigned by the users?
import java.util.Scanner;
class Electricitybill
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		//up is unit price , tc is total consumption and tb is total bill
		int up,tc,tb; 
		System.out.println("Enter the unit price : ");
		up = sc.nextInt();
		System.out.println("Enter total consumption : ");
		tc = sc.nextInt();
		tb = up*tc;
		System.out.println("Your Electricity bill is "+tb);
	}
}