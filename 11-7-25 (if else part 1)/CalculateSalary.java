// WAP to calculate salary where basic, ta, da, comm, pf,hra,noofleave will be assigned by the users?
import java.util.Scanner;
class  CalculateSalary
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		
		float basicSalary,travelAllowance,dearnessAllowance,commission,providentfund,houserentallowance,noofleave,perdaysalary,leavededuction;
		int workingday;
		System.out.println("Enter basic salary ");
		basicSalary = sc.nextFloat();
		
		System.out.println("Enter travel allowance");
		travelAllowance = sc.nextFloat();
		
		System.out.println("Enter dearness allowance");
		dearnessAllowance = sc.nextFloat();
		
		System.out.println("Enter sales commission");
		commission = sc.nextFloat();
		
		System.out.println("Enter provident fund");
		providentfund = sc.nextFloat();
		
		System.out.println("Enter house rent allowance");
houserentallowance = sc.nextFloat();
		
		System.out.println("Enter number of unpaid leave ");
		noofleave = sc.nextFloat();
		
		System.out.println("Enter the monthly working day");
		workingday = sc.nextInt();
		
		//gross salary
		float grossSalary =  basicSalary+travelAllowance + dearnessAllowance + houserentallowance +commission;
		
		//perdaysalary
		perdaysalary = grossSalary/workingday; 
		
		leavededuction = perdaysalary*noofleave;
		
		float netsalary = grossSalary - leavededuction - providentfund;
	
		System.out.println("salary detail : ");
		System.out.println("Gross Salary :"+grossSalary);
		System.out.println("Leave deduction : "+leavededuction);
		System.out.println("Net Salary : "+netsalary);
		
	
	}
}