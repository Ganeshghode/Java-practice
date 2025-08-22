// Wap to print the id,name,designation,salary of employee using inheritance.

//Single inheritance
//parent class

/*class Admin
{
	String Companyname;
	void Accept(String Companyname)
	{
		this.Companyname = Companyname;
	}
	void Display()
	{
		System.out.println("Companyname is "+Companyname);
	}
}

//child class
class Manager extends Admin
{
	int id,salary;
	String name,designation;
	void Accept1(String name,String designation,int id,int salary)
	{
		this.name = name;
		this.designation = designation;
		this.id =  id;
		this.salary = salary;
	}
	
	void Display1()
	{
		System.out.println("Employee name is "+name);
		System.out.println("Employee designation is "+designation);
		System.out.println("Employee id is "+id);
		System.out.println("Employee salary is "+salary);
	}
}
//main class
class Employeedata
{	
	public static void main(String args[])
	{
		System.out.println("Single inheritance");
		
		// creating obj of manager class 
		Manager obj =  new Manager();
		
		//calling fucn of manager class
		obj.Accept("tata");
		obj.Display();
		obj.Accept1("ganesh","editor",1058,10000);
		obj.Display1();
		
	}
}

//mutilevel inheritance
//parent class
class Admin
{
	String Companyname;
	void Accept(String Companyname)
	{
		this.Companyname = Companyname;
	}
	void Display()
	{
		System.out.println("Companyname is "+Companyname);
	}
}
//sub child class
class Manager extends Admin
{
	int salary;
	String name,designation;
	void Accept1(String name,String designation,int salary)
	{
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}
	
	void Display1()
	{
		System.out.println("Employee name is "+name);
		System.out.println("Employee designation is "+designation);
		System.out.println("Employee salary is "+salary);
	}
}
//child class
class Developer extends Manager
{
	int id;
	void Accept2(int id)
	{
		this.id = id;
	}
	void Display2()
	{
		System.out.println("Employee id is "+id);
	}
	
}
//main class
class Employeedata
{	
	public static void main(String args[])
	{
		System.out.println("Multilevel inheritance");
		
		// creating obj of developer class 
		Developer obj =  new Developer();
		
		//calling fucn of developer class
		obj.Accept("tata");
		obj.Display();
		obj.Accept1("ganesh","editor",10000);
		obj.Display1();
		obj.Accept2(1058);
		obj.Display2();
		
	}
}*/

// Hierarchical inheritance
//parent class
class Admin
{
	String Companyname;
	void Accept(String Companyname)
	{
		this.Companyname = Companyname;
	}
	void Display()
	{
		System.out.println("Companyname is "+Companyname);
	}
}
//child class1
class Manager extends Admin
{
	int salary;
	String name,designation;
	void Accept1(String name,String designation,int salary)
	{
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}
	
	void Display1()
	{
		System.out.println("Employee name is "+name);
		System.out.println("Employee designation is "+designation);
		System.out.println("Employee salary is "+salary);
	}
}
//child class2
class Developer extends Admin
{
	int id;
	void Accept2(int id)
	{
		this.id = id;
	}
	void Display2()
	{
		System.out.println("Employee id is "+id);
	}
	
}
//main class
class Employeedata
{	
	public static void main(String args[])
	{
		System.out.println("Hierarchical inheritance");
		
		// creating obj of developer class 
		Developer obj =  new Developer();
		
		//calling fucn of developer and admin class
		obj.Accept("tata");
		obj.Display();
		obj.Accept2(1058);
		obj.Display2();
		
		// creating obj of manager class
		Manager obj1 =  new Manager();
		
		//calling fucn of manager class
		obj1.Accept1("ganesh","editor",10000);
		obj1.Display1();
	}
}