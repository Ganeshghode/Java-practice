//WAP to calculate compund interest?
import java.util.Scanner;
class Compoundinterest
{
	public static void main(String args[])
	{
		Scanner sc =  new Scanner(System.in);
		double p,r,t,ci;
		System.out.println("Enter principal");
		p = sc.nextDouble();
		System.out.println("Enter rate");
		r = sc.nextDouble();
		System.out.println("Enter time");
		t = sc.nextDouble();
		ci = p*Math.pow((1+(r/100)),t)-p;
		System.out.println("Compound interest is = "+ci);
	}
} 