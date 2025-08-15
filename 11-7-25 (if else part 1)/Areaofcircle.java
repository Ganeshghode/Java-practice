//WAP to calculate the area of a circle where pi will be constant and radius will be variable?
import java.util.Scanner;
class AreofCircle
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		final float  pie = 3.14f,radius,Area;
		System.out.println("Enter raduis of circle : ");
		radius = sc.nextInt();
		Area = pie * (radius*radius);
		System.out.println("Area of circle is = "+Area);
		
	}	
}