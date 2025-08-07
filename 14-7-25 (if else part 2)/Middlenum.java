class Middlenum
{
	public static void main(String args[])
	{
		int a=3,b=1,c=2;
		if(a>b && a<c || a<b && a>c)
		System.out.println("a= "+a+" is middle number ");
		if( b>a && b<c || b<a && b>c)
		System.out.println("b = "+b+" is middle number ");
		if(c>b && c<a || c<b && c>a)
		System.out.println("c= "+c+" is middle number ");
  	}

}