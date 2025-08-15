//WAP to convert  hectare to acre?
import java.util.Scanner;
class  Hectaretoacre
{
	public static void main(String args[])
	{
		Scanner sc =  new Scanner(System.in);
		double hectare,acre;
		//hectare to acre
		System.out.println("Enter area in hectare");
		hectare = sc.nextDouble();
		acre = hectare*2.47105;
		System.out.println(hectare+" hectare is "+acre+" acre");
		
		//acre to hectare
		System.out.println("Enter area in acre");
		acre = sc.nextDouble();
		hectare = acre/2.47105;
		System.out.println(acre+" acre is "+hectare+" hectare");
	}
}