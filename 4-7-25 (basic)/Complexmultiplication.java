//WAP to calculate the multiplication of Complex numbers?
import java.util.Scanner;
class Complexmultiplication
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int plusindex1,r1,i1,r2,i2,iotaindex1,plusindex2,iotaindex2,result,r,i;
		String com1,com2;
		System.out.println("Enter first complex number : ");
		com1 = sc.next();
		System.out.println("Enter second complex number : ");
		com2 = sc.next();
		//finding the index of + and i of both the complex number
		plusindex1 = com1.indexOf("+");
		iotaindex1 = com1.indexOf("i");
		
		plusindex2 = com2.indexOf("+");
		iotaindex2 = com2.indexOf("i");
		// finding real number 1 and 2 and imaginary number 1 and2
		r1 = Integer.parseInt(com1.substring(0,plusindex1));
		i1 = Integer.parseInt(com1.substring(plusindex1+1,iotaindex1));
		r2 = Integer.parseInt(com2.substring(0,plusindex2));
		i2 = Integer.parseInt(com2.substring(plusindex2+1,iotaindex2));
		
		//formula of complex multiplication (a+bi)×(c+di)=(a×c−b×d)+(a×d+b×c)i
		r = r1*r2 - i1*i2;
		i = r1*i2 + i1*r2;
		
		System.out.println("result is "+r+"+"+i+"i");
	
	}
}