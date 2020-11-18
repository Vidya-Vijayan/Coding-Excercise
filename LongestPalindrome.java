/******************************************************************************

Take two strings, check if one string is a substring of another.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string");
	    	String entrdString = scanner.nextLine();
		scanner.close();
		
        	HashSet<Character> hs = new HashSet<>();
        	int count = 0;

        	for(int i = 0; i < entrdString.length(); i++) {
            		if(hs.contains(entrdString.charAt(i))) {
                		hs.remove(entrdString.charAt(i));
                		count++;
            		} else {
                		hs.add(entrdString.charAt(i));
            		}
        	}
        	if (!hs.isEmpty())
            		return count * 2 + 1;
        	else
            		return count * 2;
	}
}
