//Wap to find the area of rectangle using inhertance.

//single inheritance
//parent class
class rectangle
{
	int length,width;
	void Accept(int length,int width)
	{
		this.length = length;
		this.width = width;
	}
}

//child class
class area extends rectangle
{
	double area;
	void Calculate()
	{
		area = length*width;
	}
	void Display()
	{
		System.out.println("Area of rectangle is "+area);
	}
}

//main class
class Areaofrectangle
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

/*
//multi level inheritance
//parent class
class rectangle1
{
	double width;
	void Accept1(double width)
	{
		this.width = width;
	}
}

//sub child class
class rectangle2 extends rectangle1
{
	double length;
	void Accept2(double length)
	{
		this.length = length;
	}
}
//child class

class area extends rectangle2
{
	double area;
	void Calculate()
	{
		area = length*width;
	}
	void Display()
	{
		System.out.println("Area of rectangle is "+area);
	}
}

//main class
class Areaofrectangle
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
}*/

