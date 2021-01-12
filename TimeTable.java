package Akanksha.labassignment1;

public class TimeTable {

	public static void main(String[] args) {
		//function calling.
		printTimeTable();
		
	}
	
	public static void printTimeTable()
	{
		System.out.print("* |");
		for(int row=1;row<=9;row++)
		{
			System.out.print(row+" ");
			if(row==9)
			System.out.println();
		}
		
		System.out.println("--------------------");
		for(int row=1;row<=9;row++)
		{	
			System.out.print(row+" |");
			for(int col=1;col<=9;col++)
			{
				System.out.print(row*col+" ");
				
				if(col==9)
				System.out.println();
			}
			
		}
	}
}
