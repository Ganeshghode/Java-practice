//WAP to calculate age where the son is 20 years younger than the father and 18 years younger than the mother what will be the age of the son, father, and mother, calculation start year will be entered by the user?
import java.util.Scanner;
class Sonage
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int presentyear,sonage,fatherage,motherage;
		System.out.println("Enter present year : ");
		presentyear = sc.nextInt();
		System.out.println("Enter son's age : ");
		sonage = sc.nextInt();
		fatherage = sonage - 20;
		motherage = sonage =18;
		System.out.println("Father'age is "+fatherage);
		System.out.println("Mother's age is "+motherage);
		
	}
}