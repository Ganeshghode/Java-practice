//WAP to increase the salary of employees from 500, 
//if the salary is less than 10000 otherwise the same salaries will print?
import java.util.Scanner;
class IncreaseSalary
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter salary");
		int salary = sc.nextInt();
		if(salary<10000)
		{
			salary+=500;
			System.out.println("salary is increase by 500  and upadated salary is "+salary);
		}
		else
		{
			System.out.println("salary does not increase "+salary);
		}
	}
}