package matrixprgm;
import java.util.Scanner;
public class Prgm6 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Array Length");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter array Element");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		int target=0;
		System.out.println("Enter Target ");
		target=scan.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==target)
				{
					System.out.print("Target value of "+target+"----->"+i+" "+j);
					break;
				}
			}
		}
		

	}

}
