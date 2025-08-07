class CheckvcLadder
{
    public static void main(String args[])
    {
        char ch1='b';
	int asc =ch1;
	char ch = (char)((asc>=65 && asc<=90)?asc+32:asc);
	if(ch=='a')
	System.out.println("vowel");
	else if (ch=='e')
	System.out.println("vowel");
	else if (ch=='i')
	System.out.println("vowel");
	else if (ch=='o')
	System.out.println("vowel");
	else if (ch=='u')
	System.out.println("vowel");
	else
	System.out.println("consonant");
	}
}
