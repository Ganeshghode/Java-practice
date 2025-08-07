class Divisible359
{
	public static void main(String args[])
	{
		String s="";
		int num =45;
		if (num%3==0)
		s+="divisible by 3,";
		if (num%5==0)
		s+="divisible by 5,";
		if (num%9==0)
		s+="divisible by 9";
		System.out.println(s);
	}

}