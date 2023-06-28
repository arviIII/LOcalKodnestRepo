package matrixprgm;
import java.util.Scanner;
public class Prgm1 {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the rows and columns value of 1D");
	int row=scan.nextInt();
	System.out.println("Enter the rows and columns value of 2D");
	int col=scan.nextInt();
	int mat1[][]=new int[row][col];
	int mat2[][]=new int[row][col];
	
	System.out.println("Enter the value of mat1");
	for(int i=0;i<=row-1;i++)
	{
		for(int j=0;j<=col-1;j++)
		{
			mat1[i][j]=scan.nextInt();
		}
	}
	
	System.out.println("Enter the value of mat2");
	for(int i=0;i<=row-1;i++)
	{
		for(int j=0;j<=col-1;j++)
		{
			mat2[i][j]=scan.nextInt();
		}
	}
	
	System.out.println("Array contents of mat1");
	//displaying the matrix of 1d array
	for(int i=0;i<=row-1;i++)
	{
		for(int j=0;j<=col-1;j++)
		{
			System.out.print(mat1[i][j]+" ");
		}
		System.out.println();
	}
	
	System.out.println("Array contents of mat2");
	//displaying the matrix of 2d array
	for(int i=0;i<=row-1;i++)
	{
		for(int j=0;j<=col-1;j++)
		{
			System.out.print(mat2[i][j]+" ");
		}
		System.out.println();
	}
	
	//adding 2 matrix
	int mat3[][]=new int[row][col];
	for(int i=0;i<=row-1;i++)
	{
		for(int j=0;j<=col-1;j++)
		{
			mat3[i][j]=mat1[i][j]+mat2[i][j];
		}
		System.out.println();
	}
	
	//display the new matrix
	System.out.println("Addition of two matrix are");
	for(int i=0;i<=row-1;i++)
	{
		for(int j=0;j<=col-1;j++)
		{
			System.out.print(mat3[i][j]+" ");
		}
		System.out.println();
	}
	
	//subtract 2 matrix
		int mat4[][]=new int[row][col];
		for(int i=0;i<=row-1;i++)
		{
			for(int j=0;j<=col-1;j++)
			{
				mat4[i][j]=mat1[i][j]-mat2[i][j];
			}
			System.out.println();
		}
		
		//display the new matrix
		System.out.println("Subtraction of two matrix are");
		for(int i=0;i<=row-1;i++)
		{
			for(int j=0;j<=col-1;j++)
			{
				System.out.print(mat4[i][j]+" ");
			}
			System.out.println();
		}
		
		//divison 2 matrix
				int mat5[][]=new int[row][col];
				for(int i=0;i<=row-1;i++)
				{
					for(int j=0;j<=col-1;j++)
					{
						mat4[i][j]=mat1[i][j]/mat2[i][j];
					}
					System.out.println();
				}
				
				//display the new matrix
				System.out.println("Divison of two matrix are");
				for(int i=0;i<=row-1;i++)
				{
					for(int j=0;j<=col-1;j++)
					{
						System.out.print(mat4[i][j]+" ");
					}
					System.out.println();
				}
				
		
				
		//digonal of 2 matrix
				
				System.out.println("Digonal Matrix of mat1 & mat2");
				int sum=0,sum1=0;
				for(int i=0;i<=row-1;i++)
				{
					for(int j=0;j<=col-1;j++)
					{
						if(i==j)
						{
							sum+=mat1[i][j];
						}
						if(i+j==row-1)
						{
							sum1+=mat2[i][j];
						}
						
					}
				}
				System.out.println("Sum of digonal--->"+sum+" "+sum1);
				
				
				
				
	}
	
	

}
