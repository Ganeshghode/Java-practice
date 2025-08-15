// WAP to reverse 7 digit number?
class Reverse7
{
	public static void main(String args[])
	{
		int num = 1234567;
		int a,b,c,d,e,f,g;
		a = num%10;
		num = num/10;
		b = num%10;
		num = num/10;
		c = num%10;
		num = num/10;
		d = num%10;
		num = num/10;
		e = num%10;
		num = num/10;
		f = num%10;
		num = num/10;
		g = num%10;
		num = num/10;
		int rev = a*1000000+b*100000+c*10000+d*1000+e*100+f*10+g*1;
		System.out.println("Reverse is = "+rev);
		
	}
}