class Increment {
public static void main(String args[])
{	
	//post
	int a=5;
	int b;
	b=a++;
   	System.out.println( a + "," + b);
	//pre
	int c=5;
	int d;
	d=++c;
	System.out.println(c+","+d);
}
	}