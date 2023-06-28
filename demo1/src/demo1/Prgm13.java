package demo1;
import java.util.Scanner;
public class Prgm13 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{	
		    for(int k=1;k<=(2*i-1);k++)
		      {
				System.out.print("*");	
			  }
			System.out.println();
		}
		
		for(int i=1;i<=5;i++)
		{		
		    for(int k=9;k>=(2*i-1);k++)
		      {
				System.out.print("*");	
			  }
			System.out.println();
		}

		

	}

}
