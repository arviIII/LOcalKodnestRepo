package demo1;

public class Prgm111 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int k=5;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=(2*i-1);j++)	
			{
				System.out.print("*");
			}
			for(int l=1;l<=10;l++)
			{
				System.out.print("-");
			}
		System.out.println(" ");
		}
		System.out.println(" ");
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=19;j++)
			{
				if(i==1||i==5||j==1||j==19||i==5||j==9)
				{
					System.out.print(" *");
				}
				else
				{
					System.out.println(" ");
				}
			}
			System.out.println(" ");
		}
	}

}
