/******************************************************************************

Reverse words in a sentence - Take sample sentence and print reverse words of sentence.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter a string");
	    String entrdString = scanner.nextLine();
	    
	    System.out.println("Reversed Sentence : ");
	    String strArray[] = entrdString.split(" ");
	    
	    String reversedString = "";
	    for(int i=strArray.length-1; i>=0; i--){
	        reversedString = reversedString.concat(strArray[i]).concat(" ");
	    }
	    System.out.println(reversedString);
	}
}
