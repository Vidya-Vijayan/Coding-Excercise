/******************************************************************************

String Reversal using Iteration / Recursion - Take sample String and print reverse of String characters.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter a string");
	    String entrdString = scanner.nextLine();
	    
	    System.out.println("Reversed String : ");
	    char[] charArray= entrdString.toCharArray();
	    
	    StringBuilder sb = new StringBuilder(); 
	    for(int i=charArray.length-1; i>=0; i--){
	        sb.append(charArray[i]); 
	    }
	    System.out.println(sb.toString());
	}
}
