//WAP to display "You are Qualintine for 15 days " if a person is Covid positive otherwise not display any message?
import java.util.Scanner;
class CovidResult
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your covid result:");
		String result = sc.next();
		if(result.equals("positive") && result.equals("negative"))
		{
			if(result.equals("positive"))
			{
				System.out.println("Your are quarntine for 15 days");
			}
			else
			{
				System.out.println("Stay safe take precautions");
			}
		}
		else
		{
			System.out.println("incorrect result");
		}
	}
}