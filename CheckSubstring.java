/******************************************************************************

Take two strings, check if one string is a substring of another.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter 1st string");
	    String firstString = scanner.nextLine();
	    
	    System.out.println("Enter 2nd string");
	    String secondString = scanner.nextLine();
	    
	    if (secondString.contains(firstString)) {
	       System.out.println(firstString + " is a substring of " + secondString);
	    } else if (firstString.contains(secondString)) {
	       System.out.println(secondString + " is a substring of " + firstString);
	    } else {
	       System.out.println("Not a substring");
	    }
	}
}
