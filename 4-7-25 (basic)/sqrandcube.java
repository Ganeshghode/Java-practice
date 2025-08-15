//WAP to calculate the square and cube of any assigned number?
import java.util.Scanner;
class  Sqrandcube
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int side=0,square,cube;
		System.out.println("Enter the side of sqaure");
		side = sc.nextInt();
		square = side*side;
		cube = square*side;
		System.out.println("Square is "+square+" and cube is "+cube);
		
	}
}