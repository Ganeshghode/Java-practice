class Changecase
{
	public static void main(String args[])
	{
		char ch='a';
		int asc=ch;
		int ch1 = (asc>=65 && asc<=90)?(asc+32):(asc-32);
		System.out.println((char)ch1);
}}
		