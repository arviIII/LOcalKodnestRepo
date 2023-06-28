package matrixprgm;

public class Prgm5 {

	public static void main(String[] args) {
		int [][]a = {{1,2,3},{1,2,3},{1,2,3}};
		int [][]b = {};
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=b.length-1;j++)
			{
				b[j][i]=a[i][j];
			}
		}
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=b.length-1;j++)
			{
				System.out.println(b[j][i]);
			}
		}
		

	}

}
