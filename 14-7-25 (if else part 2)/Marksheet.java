import java.util.Scanner;
class Marksheet
{
	public static void main(String args[])
	{
		int f=0, s=0;
		String gracesub=" ";
		String supply=" ";
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the marks of subjects: "); 

		System.out.println("Enter the marks of maths :");
	    	int maths = sc.nextInt(); 
		if(maths<0 || maths>100)
		{
			System.out.println("please Re-enter the marks of maths");
			maths = sc.nextInt();
		}	

		System.out.println("Enter the marks of physics :");
	    	int physics = sc.nextInt();
		if(physics<0 || physics>100)
		{
			System.out.println("please Re-enter the marks of physics");
			physics = sc.nextInt();
		}

		System.out.println("Enter the marks of chemistry :");
	    	int chemistry = sc.nextInt();
		if(chemistry<0 || chemistry>100)
		{
			System.out.println("please Re-enter the marks of chemistry");
			chemistry = sc.nextInt();
		}

		System.out.println("Enter the marks of hindi :");
	    	int hindi = sc.nextInt();
		if(hindi<0 || hindi>100)
		{
			System.out.println("please Re-enter the marks of hindi");
			hindi = sc.nextInt();
		}

		System.out.println("Enter the marks of english :");
	    	int english = sc.nextInt();
		if(english<0 || english>100)
		{
			System.out.println("please Re-enter the marks of english");
			english = sc.nextInt();
		}
		if(maths<33 && maths>28)
		{
			int grace = 33-maths;
			maths+=grace;
			f+=1;
			gracesub = "you got grace in maths";
		}
		else
		{
			s+=1;
			supply = "you got supplementary in maths";
		}
		if(physics<33 && physics>28)
		{
			int grace = 33-physics;
			physics+=grace;
			f+=1;
			gracesub = "you got grace in physics";
		}
		else
		{
			s+=1;
			supply = "you got supplementary in physics";
		}
		if(chemistry<33 && chemistry>28)
		{
			int grace = 33-chemistry;
			chemistry+=grace;
			f+=1;
			gracesub = "you got grace in chemistry";
		}
		else
		{
			s+=1;
			supply = "you got supplementary in chemistry";
		}
		if(hindi<33 && hindi>28)
		{
			int grace = 33-hindi;
			hindi+=grace;
			f+=1;
			gracesub = "you got grace in hindi";
		}
		else
		{
			s+=1;
			supply = "you got supplementary in hindi";
		}
		if(english<33 && english>28)
		{
			int grace = 33-english;
			english+=grace;
			f+=1;
			gracesub = "you got grace in english";
		}
		else
		{
			s+=1;
			supply = "you got supplementary in english";
		}
		if(f>1)
		{
			System.out.println("Student is fail");
		}
		if(f==1)
		{
			System.out.println("Student is pass by grace");
		}
		System.out.println(gracesub);
		System.out.println(supply);
		if(s<=1)
		{
		System.out.println("Supplementary");	
		}
		if(maths>=33 && physics>=33 && chemistry>=33 && hindi>=33 && english>=33 )
		{
			int total=(maths+physics+chemistry+hindi+english)/5;
			System.out.println("Student is pass");
			System.out.println("Percentage = "+total+"%");
			if(total>=60)
			{
				System.out.println("Division is = I");
			}
			else
			{
				if(total>=45)
				{
					System.out.println("Division is = II");
				}
				else
				{
					if(total>=33)
					{																					System.out.println("Division is = III");
					}
				}
			}
		}
		
	}

}