
public class Hanoi
{

	static int brik = 4;
	static int sticks = 3;
	public static void main(String[] args)
	{
		tower(brik, 1, 2, 3);
	}
	
	public static void tower(int brik, int a, int b, int c)
	{
		if(brik == 1)
		{
			System.out.println("Brik: 1 from " + a + " to " + c);
		}
		
		else
		{
			tower(brik - 1, a, c, b);
			System.out.println("Brik: " + brik + " from " + a + " to " + c);
			tower(brik - 1, b, a, c);
			
		}
	}
}
