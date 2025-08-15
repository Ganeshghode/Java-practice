//WAP to convert cm to meter and meter to CM?
import java.util.Scanner;
class mtocm
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		float m,cm;
		//m to cm
		System.out.println("Enter the length in meters");
		m = sc.nextInt();
		cm = m*100;
		System.out.println(m+" meters is  = "+cm+" centimeters");
		
		//cm to m
		System.out.println("Enter the length in centimeters");
		cm = sc.nextInt();
		m = cm/100;
		System.out.println(cm+" centimeters is  = "+m+" centimeters");
		
		
	}
}