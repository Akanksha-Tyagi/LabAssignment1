package akanksha.labassignment1;
import java.util.Scanner;
public class GradesAverage {
	static Scanner sc;
	public static void main(String[] args) {
		int  numStudents;
		sc=new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		 numStudents=sc.nextInt();
		 //function calling
		 calculateAverage(numStudents);
		 sc.close();
		
}
	public static void calculateAverage(int  numStudents) {
		// TODO Auto-generated method stub
		int [] grades=new int[numStudents];
		int sum=0;
		double average;
		for(int numStud=1;numStud<=numStudents;numStud++)
		{
			System.out.print("Enter the grade for student "+numStud+": ");
			grades[numStud-1]=sc.nextInt();
			if(grades[numStud-1]<0||grades[numStud-1]>100)
			{
				System.out.println("Invalid grade, try again...");
				numStud--;
				continue;
				
			}
			sum+=grades[numStud-1];
		}
		average=(double)sum/numStudents;
		System.out.println("The average is: "+average);

	}
}
