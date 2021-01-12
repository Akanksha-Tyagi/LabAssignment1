package Akanksha.labassignment1;
import java.util.Scanner;
public class PascalTriangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of Pascal Triangle: ");
		int numRows=sc.nextInt();
		//calling printPascal function
		printPascal(numRows);
		sc.close();
		
	}
	public static void printPascal(int numRows)
	{
		  for(int row = 0; row <numRows; row++) {
		      for(int space = 0; space< numRows-row; space++)
		        System.out.print("  ");
		      for(int col = 0; col<=row; col++)
			        System.out.print(calculateBinomialCoeff(row,col)+"  ");
		      System.out.println();
		  }
		         
	}
	public static int calculateBinomialCoeff(int n,int r)
	{
		int result=1;
		if(r>n-r)
			r=n-r;
		for(int index=0;index<r;index++)
		{
			result*=(n-index);
			result/=(index+1);
		}
		return result;
	}
	

}
