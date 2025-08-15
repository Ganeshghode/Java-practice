//   WAP to calculate the area of a triangle using heron's formula in java?
//s = (a + b + c) / 2. 
//Area = √{s(s-a)(s-b)(s-c)}
import java.util.Scanner;
class Aoftriangle
{
	public static void main(String args[])
	{
		Scanner sc =  new Scanner (System.in);
		int a,b,c,s;
		System.out.println("Enter first side of triangle : ");
		a = sc.nextInt();
		System.out.println("Enter second side of triangle : ");
		b = sc.nextInt();
		System.out.println("Enter third side of triangle : ");
		c = sc.nextInt();
		s = (a+b+c)/2;
		double area = Math.pow((s*(s-a)*(s-b)*(s-c)),0.5);
		System.out.println("Area of triangle is = "+area);
		
	}
}