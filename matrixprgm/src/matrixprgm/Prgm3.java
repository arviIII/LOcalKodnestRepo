package matrixprgm;

public class Prgm3 {

	public static void main(String[] args) {
		//create a matrix array
		int [][]a = {{1,2,3},{4,5,6},{7,8,9}};
		int sum=0;
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a.length-1;j++)
			{
				if(i<j)
				{
					sum+=a[i][j];
				}
				
			}
			
		}
		System.out.println(sum);
		//lowertraingle
		int sum1=0;
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a.length-1;j++)
			{
				if(i>j)
				{
					sum1+=a[i][j];
				}
			}
			
		}
		System.out.println(sum1);
		

	}

}
