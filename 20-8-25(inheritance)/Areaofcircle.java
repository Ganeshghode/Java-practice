//Wap to find the area of circle using inhertance.

//single inheritance
//parent class
class circle
{
	double r;
	void Accept(int r)
	{
		this.r = r;
	}
}

//child class
class area extends circle
{
	double area;
	void Calculate()
	{
		area = Math.PI*r*r;
	}
	void Display()
	{
		System.out.println("Area of circle is "+area);
	}
}

//main class
class Areaofcircle
{
	public static void main(String args[])
	{
		System.out.println("single inheritance");
		//creating obj of area class
		area obj = new area();
		
		//calling area class
		obj.Accept(5);
		obj.Calculate();
		obj.Display();
	}
}
