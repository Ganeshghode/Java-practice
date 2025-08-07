class Great{
public static void main(String args[])
{
	int a=2f,b=3,c=1;
	if(a>b)
	{
		if(a>c)
		{
			System.out.println("a is greater than b and c"); 
		}
		else
		{
			System.out.println("c is greater than a and b");
		}
	}
	else
	{
		if(b>c)
		{
			System.out.println("b is greater than a and c");
		}
		else
		{
			System.out.println("c is greater than a and b");
		}
	}
}}