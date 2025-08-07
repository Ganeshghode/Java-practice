class Checkvc
{
	public static void main(String args[])
	{
		char ch1='f';
		String s="";
		int asc =ch1;
		char ch = (char)((asc>=65 && asc<=90)?asc+32:asc);
		if(ch=='a')
		{
			s="vowel";
		}
		else
		{
			if(ch=='e')
			{
				s="vowel";
			}
			else
			{
				if(ch=='i')
				{
					s="vowel";
				}
				else
				{
					if(ch=='o')
					{
						s="vowel";
					}
					else
					{
						if(ch=='u')
						{
							s="vowel";
						}
						else
						{
							s="consonant";			
						}
					}				
				}
			}
		}
	System.out.println(s);	
}
}