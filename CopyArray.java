package Akanksha.labassignment1;

import java.util.Scanner;

//copyarray without using builtin function.

class ArrayCopyDemo{
public static int[] copyOf(int[] array)
{
	int [] copyarray=new int[array.length];
	for(int index=0;index<array.length;index++)
		copyarray[index]=array[index];
	return copyarray;
}
}
public class CopyArray {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the size of an array: ");
		int size=sc.nextInt();
		int array[]=new int[size]; 
		
		System.out.print("Enter the elements of an array: ");
		for(int index=0;index<array.length;index++)
			array[index]=sc.nextInt();
		
		System.out.println("Before calling copyOf function original array: ");
		print(array);
		
		int copiedarray[]=ArrayCopyDemo.copyOf(array);
		copiedarray[0]=copiedarray[0]*2;
		
		System.out.println("After calling copyOf function and modify the copied array..");
		System.out.println("Original Array: ");
		print(array);
		System.out.println("Copied Array:");
		print(copiedarray);
		sc.close();
		
	}
	
	
	private static void print(int[] temp) {
		for(int t: temp) {
			System.out.print(t+" ");
		}
		System.out.println();
	}
}
