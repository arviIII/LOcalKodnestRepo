package matrixprgm;

public class Prgm4 {

	public static void main(String[] args) {
		//create a matrix array
				int [][]a = {{1,2,3},{4,5,6},{7,8,9}};
				int sum=0;
				for(int i=0;i<=a.length-1;i++)
				{
					for(int j=0;j<=a.length-1;j++)
					{
						if(i==0||i==2||(i==1&&j==0)||(i==1&&j==2))
						{
							sum+=a[i][j];
						}
					}
					
				}
				System.out.println(sum);

	}

}
