package Akanksha.labassignment1;
import java.util.Scanner;
public class ReverseString {
			private static String inputstring;
			private static int instringlength;
			public static void main(String[] args) {
				
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the string you want to reverse: ");
				inputstring=sc.nextLine();
				instringlength=inputstring.length();
				System.out.println("Original String: ");
				System.out.println(inputstring);
				System.out.println("Reverse String: ");
				for(int index=instringlength-1;index>=0;index--)
				{
					System.out.print(inputstring.charAt(index));
				}
				sc.close();
			}
			

}
