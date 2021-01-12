package Akanksha.labassignment1;
import java.util.Scanner;
public class ReverseSentence {
			private static String inputstring;
			public static void main(String[] args) {
				
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the sentence you want to reverse: ");
				inputstring=sc.nextLine();
				reverseSentence(inputstring);
				sc.close();
			}
			public static void reverseSentence(String inputstring) {
				String []Sentence=inputstring.split(" ");
				String reverseSentence="";
				int sentencelength=Sentence.length;
				
				System.out.println("Original Sentence: ");
				System.out.println(inputstring);
				System.out.println("Reverse Sentence: "); 
				
				for(int index=sentencelength-1;index>=0;index--)
				{
					reverseSentence=reverseSentence+Sentence[index]+" ";
				}
				
				System.out.println(reverseSentence);
			}
			

}
