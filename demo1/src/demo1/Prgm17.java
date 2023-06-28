package demo1;

public class Prgm17 {

	public static void main(String[] args) {
		for(int i=1;i<=8;i++)
		{
			for(int j=1;j<=6;j++)
			{
				if((i==1 && j!=1 && j!=6 || j==1 && i!=1 && i!=8 || j==6 && i!=1 && i!=8 || i==4 && j!=1 && j!=6 ))
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
