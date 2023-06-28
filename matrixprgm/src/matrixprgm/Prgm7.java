package matrixprgm;
import java.util.Scanner;
public class Prgm7 {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the rows and columns value of 1D&2D");
	int a[][]=new int[scan.nextInt()][scan.nextInt()];
	int b[][]=new int[scan.nextInt()][scan.nextInt()];
	System.out.println("Array Elements are");
	//taking the input and storing
	for(int i=0;i<=a.length-1;i++)
	{
	for(int j=0;j<=b.length-1;j++)
	{
	a[i][j]=scan.nextInt();
	}
	}
	System.out.println("Array contents are ");
	//displaying the matrix of 1d and 2d array
	for(int i=0;i<=a.length-1;i++)
	{
	for(int j=0;j<=a.length-1;j++)
	{
	System.out.print(a[i][j]+" ");
	}
	System.out.println();
	}
	System.out.println();
	//matrix2
	for(int i=0;i<=b.length-1;i++)
	{
		for(int j=0;j<=b.length-1;j++)
		{
			b[j][b.length-i-1]=a[i][j];
		}
	}
	System.out.println("Reverse matirx is");
	for(int i=0;i<=b.length-1;i++)
	{
		for(int j=0;i<=b.length-1;j++)
		{
			System.out.print(b[i][j]+" ");
		}
		System.out.println();
	}

	}

}
