//Wap to find the area of triangle using inhertance.
/*
//single inheritance
//parent class
class triangle
{
	double base,height;
	void Accept(double base, double height)
	{
		this.base = base;
		this.height = height;
	}
}

//child class
class area extends triangle
{
	double area;
	void Calculate()
	{
		area = 0.5*base*height;
	}
	void Display()
	{
		System.out.println("Area of triangle is "+area);
	}
}

//main class
class AreaofTriangle
{
	public static void main(String args[])
	{
		System.out.println("single inheritance");
		//creating obj of area class
		area obj = new area();
		
		//calling area class
		obj.Accept(3,4);
		obj.Calculate();
		obj.Display();
	}
}
*/

//multi level inheritance
//parent class
class triangle1
{
	double height;
	void Accept1(double height)
	{
		this.height = height;
	}
}

//sub child class
class triangle2 extends triangle1
{
	double base;
	void Accept2(double base)
	{
		this.base = base;
	}
}
//child class
class area extends triangle2
{
	double area;
	void Calculate()
	{
		area = 0.5*base*height;
	}
	void Display()
	{
		System.out.println("Area of triangle is "+area);
	}
}

//main class
class AreaofTriangle
{
	public static void main(String args[])
	{
		System.out.println("Multilevel inheritance");
		//creating obj of area class
		area obj = new area();
		
		//calling area class
		obj.Accept1(3);
		obj.Accept2(4);
		obj.Calculate();
		obj.Display();
	}
}

