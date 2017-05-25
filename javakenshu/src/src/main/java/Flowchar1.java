package src.main.java;

public class Flowchar1
{
	public static void main(String[] args)
	{
		for (int n=1; n<=100; n++)
		{
			if (n%3 == 0)
			{
				if (n%5 == 0)
				{
					System.out.println("Fizzbazz");
				} else
				{
					System.out.println("Fizz");
				}
			} else if (n%5 == 0)
				{
					System.out.println("bazz");
				} else
				{
					System.out.println(n);
				}
		}
	}
	
}