class greatest5
{
	public static void main(String args[])
	{
		int a = 25,b = 90,c = 12,d = 67,e = 54,greatest;

        if (a > b && a > c && a > d && a > e)
            greatest = a;
        else if (b > a && b > c && b > d && b > e)
            greatest = b;
        else if (c > a && c > b && c > d && c > e)
            greatest = c;
        else if (d > a && d > b && d > c && d > e)
            greatest = d;
        else
            greatest = e;

        System.out.println("Greatest number is: " + greatest);
    }
}
