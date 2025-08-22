// WAP to calculate the addition,subtraction,multiplication and divide using inheritance.
/*
//single inheritance
//parent class
class Num1
{
	int a,b;
	void Accept(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
}

//child class
class Num2 extends Num1 
{
	int c1,c2,c3,c4;
	void Calculate1()
	{
		c1 = a+b;
	}
	void Calculate2()
	{
		c2 = a-b;
	}
	void Calculate3()
	{
		c3 = a*b;
	}
	void Calculate4()
	{
		if(b!=0)
		{
			c4 = a/b;
		}
		else
		{
			System.out.println("divide is not possible for b=0");
		}
		
	}
	void Display()
	{
		System.out.println("Addition :"+c1);
		System.out.println("Subtraction :"+c2);
		System.out.println("Multiplication :"+c3);
		System.out.println("Division :"+c4);
	}
}

//main class
class Sum
{
	public static void main(String args[])
	{
		System.out.println("single inheritance");
		//creating obj of addition class
		Num2 obj = new Num2();
		
		//calling Num2 class
		obj.Accept(3,0);
		obj.Calculate1();
		obj.Calculate2();
		obj.Calculate3();
		obj.Calculate4();
		obj.Display();
	}
}*/

/*
//multi level inheritance
//parent class
class Num1
{
	int a;
	void Accept1(int a)
	{
		this.a = a;
	}
}

//sub child class
class Num2 extends Num1
{
	int b;
	void Accept2(int b)
	{
		this.b = b;
	}
}
//child class
class Find extends Num2 
{
	int c1,c2,c3,c4;
	void Calculate1()
	{
		c1 = a+b;
	}
	void Calculate2()
	{
		c2 = a-b;
	}
	void Calculate3()
	{
		c3 = a*b;
	}
	void Calculate4()
	{
		if(b!=0)
		{
			c4 = a/b;
		}
		else
		{
			System.out.println("divide is not possible for b=0");
		}
	}
	void Display()
	{
		System.out.println("Addition :"+c1);
		System.out.println("Subtraction :"+c2);
		System.out.println("Multiplication :"+c3);
		System.out.println("Division :"+c4);
	}
}

//main class
class Sum
{
	public static void main(String args[])
	{
		System.out.println("multi level inheritance");
		//creating obj of Find class
		Find obj = new Find();
		
		//calling Num2 class
		obj.Accept1(3);
		obj.Accept2(7);
		obj.Calculate1();
		obj.Calculate2();
		obj.Calculate3();
		obj.Calculate4();
		obj.Display();
	}
}
*/

//Hierarchical inheritance
//parent class
class Num1
{
	int a,b;
	void Accept(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
}

//child1 class
class Find1 extends Num1
{
	int c1,c2;
	void Calculate1()
	{
		c1 = a+b;
	}
	void Calculate2()
	{
		c2 = a-b;
	}
	void Display1()
	{
		System.out.println("Addition :"+c1);
		System.out.println("Subtraction :"+c2);
	}
}
//child2 class
class Find2 extends Num1 
{
	int c3,c4;
	void Calculate3()
	{
		c3 = a*b;
	}
	void Calculate4()
	{
		if(b!=0)
		{
			c4 = a/b;
		}
		else
		{
			System.out.println("divide is not possible for b=0");
		}
	}
	void Display2()
	{
		System.out.println("Multiplication :"+c3);
		System.out.println("Division :"+c4);
	}
}

//main class
class Sum
{
	public static void main(String args[])
	{
		System.out.println("hierarchical inheritance");
		//creating obj of Find1 class
		Find1 obj1 = new Find1();
		
		//calling num1 through Find1 class
		obj1.Accept(3,4);
		obj1.Calculate1();
		obj1.Calculate2();
		obj1.Display1();
		
		//creating obj of Find2 class
		Find2 obj2 = new Find2();
		
		//calling num2 through Find1 class
		obj2.Accept(3,4);
		obj2.Calculate3();
		obj2.Calculate4();
		obj2.Display2();
	}
}