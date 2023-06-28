package demo1;

public class Prgm16 {

	public static void main(String[] args) {
		//A
		
		for(int i=1;i<=8;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==1||j==1||i==5||j==5)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}System.out.println();
		}
		
		// B
		
		System.out.println();
		
		for(int i=1;i<=8;i++)
		{
			for(int j=1;j<=6;j++)
			{
				if(i==1||j==1||i==4||j==6||i==8)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}System.out.println();
		}
		
		//C
		
		System.out.println();
		
		for(int i=1;i<=8;i++)
		{
			for(int j=1;j<=6;j++)
			{
				if(i==1||j==1||i==8)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}System.out.println();
		}
		
		
		


	}

}
