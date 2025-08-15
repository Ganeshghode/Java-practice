//WAP to reverse a five-digit number without using a loop?
class Reverse
{
	public static void main(String args[])
	{
		int num=12345,a,b,c,d,e,rev;
		a =  num%10;
		num = num/10;
		b =  num%10;
		num = num/10;
		c =  num%10;
		num = num/10;
		d =  num%10;
		num = num/10;
		e =  num%10;
		num = num/10;
		rev = a*10000+b*1000+c*100+d*10+e*1;
		System.out.println("Reverse of 5 digit number is ="+rev);
		
		
	}
}