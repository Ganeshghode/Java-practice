//WAP to convert feet to inch and inch to feet?
import java.util.Scanner;
class Feettoinch
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		float inch,foot;
		//foot to inches
		System.out.println("Enter the length in foot");
		foot = sc.nextInt();
		inch = foot*12;
		System.out.println(foot+" foot is  = "+inch+" inches");
		
		//inches to foot
		System.out.println("Enter the length in inches");
		inch = sc.nextInt();
		foot = inch/12;
		System.out.println(inch+" inches is  = "+foot+" foot");
	}
}