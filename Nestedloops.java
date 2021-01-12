package Akanksha.labassignment1;
import java.util.Scanner;
public class Nestedloops {
	public static void triangularPatterns(int size)
	{
		System.out.println("---------------TriangularPattern 1---------------");
		for(int row=0;row<size;row++)
		{
			for(int col=0;col<=row;col++)
			{
				System.out.print("# ");
			}
			System.out.println();
		}
		System.out.println("---------------TriangularPattern 2---------------");
		for(int row=size-1;row>=0;row--)
		{
			for(int col=0;col<=row;col++)
			{
				System.out.print("# ");
			}
			System.out.println();
		}
		System.out.println("---------------TriangularPattern 3---------------");
		for(int row=0;row<size;row++)
		{
			for(int space=0;space<=row-1;space++)
			{
				System.out.print("  ");
			}
			for(int col=size-1;col>row-1;col--)
			{
				System.out.print("# ");
			}
			System.out.println();
		}
		System.out.println("---------------TriangularPattern 4---------------");
		for(int row=0;row<size;row++)
		{
			for(int space=size-1;space>=row+1;space--)
			{
				System.out.print("  ");
			}
			for(int col=0;col<=row;col++)
			{
				System.out.print("# ");
			}
			System.out.println();
		}
		
	}
	public static void boxPatterns(int size)
	{
		System.out.println("---------------BoxPattern 1---------------");
		for(int row=0;row<size;row++)
		{
			for(int col=0;col<size;col++)
			{
				if(row==0||row==size-1||col==0||col==size-1)
					System.out.print("# ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}	
		System.out.println("---------------BoxPattern 2---------------");
		for(int row=0;row<size;row++)
		{
			for(int col=0;col<size;col++)
			{
				if(row==0||row==size-1||row==col)
					System.out.print("# ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}		
		System.out.println("---------------BoxPattern 3---------------");
		for(int row=0;row<size;row++)
		{
			for(int col=0;col<size;col++)
			{
				if(row==0||row==size-1||row+col==size-1)
					System.out.print("# ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println("---------------BoxPattern 4---------------");
		for(int row=0;row<size;row++)
		{
			for(int col=0;col<size;col++)
			{
				if(row==0||row==size-1||row+col==size-1||row==col)
					System.out.print("# ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println("---------------BoxPattern 5---------------");
		for(int row=0;row<size;row++)
		{
			for(int col=0;col<size;col++)
			{
				if(row==0||row==size-1||row+col==size-1||row==col||col==0||col==size-1)
					System.out.print("# ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	public static void numericPatterns(int size)
	{
		System.out.println("---------------numericPattern 1---------------");
		for(int row=0;row<size;row++)
		{
			for(int col=0;col<=row;col++)
			{
				System.out.print((col+1) +" ");
			}
			System.out.println();
		}
		System.out.println("---------------numericPattern 2---------------");
		for(int row=size-1;row>=0;row--)
		{
			for(int col=0;col<=row;col++)
			{
				System.out.print((col+1) +" ");
			}
			System.out.println();
		}
		System.out.println("---------------numericPattern 3---------------");
		for(int row=0;row<size;row++)
		{
			for(int space=size-1;space>=row+1;space--)
			{
				System.out.print("  ");
			}
			for(int col=row;col>=0;col--)
			{
				System.out.print((col+1) +" ");
			}
			System.out.println();
		}
		System.out.println("---------------numericPattern 4---------------");
		for(int row=0;row<size;row++)
		{
			
			for(int col=size-1-row;col>=0;col--)
			{
				System.out.print((col+1) +" ");
			}
			System.out.println();
		}
	}
	
	
	public static void hillPatterns(int size)
	{
		System.out.println("---------------hillPattern 1---------------");
		for(int row=0;row<size;row++)
		{
			for(int space=size-1;space>=row+1;space--)
			{
				System.out.print("  ");
			}
			for(int col=0;col<=row;col++)
			{
				System.out.print("# ");
			}
			for(int col=0;col<=row-1;col++)
			{
				System.out.print("# ");
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		int size;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size (non-negative) of the pattern");
		size=sc.nextInt();
		if(size<=0)
		{
			System.out.println("Please enter the valid size and try again.......");
			
		}
		else
		{
			triangularPatterns(size);
			boxPatterns(size);
			numericPatterns(size);
			hillPatterns(size);
			sc.close();
		}
		
	}

}
