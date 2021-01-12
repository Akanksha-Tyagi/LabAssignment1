package Akanksha.labassignment1;

public class Fibonacci {
	public static void main(String[] args) {
		int nMAX=20;
		//function calling
		fibonaciseries(nMAX);
	}

	public static void fibonaciseries(int nMAX)
	{
		//variables declarations.
		
		int fibNUM1=1;
		int fibNUM2=1;
		int sum=fibNUM1+fibNUM2;
		int fibonacci=0;
		double average;
		
		System.out.println("The first "+nMAX+" Fibonacci numbers are:");
		System.out.print(fibNUM1+" "+fibNUM2);

		for(int index=3;index<=nMAX;index++)
		{   
			fibonacci=fibNUM1+fibNUM2;
			System.out.print(" "+fibonacci);
			fibNUM1=fibNUM2;
			fibNUM2=fibonacci;
			sum+=fibonacci;;
		}
		
		System.out.println();
		average=(double)sum/nMAX;
		System.out.println("The average is "+average);
	}

}
