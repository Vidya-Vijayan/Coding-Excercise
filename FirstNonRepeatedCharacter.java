/******************************************************************************

Find first non repeated character of String - Take sample String and print first non-duplicate character.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter a string");
	    String entrdString = scanner.nextLine();
	    System.out.println("The first non repeated character is : ");
	    Map<Character, Integer> map = new HashMap<Character, Integer>();
	    for(Character character : entrdString.replaceAll("\\s", "").toCharArray()){
	        if(map.containsKey(character)) 
	            map.put(character,(Integer)map.get(character) + 1);
	        else 
	            map.put(character,1);
	    }
	    
	    for (Character character : entrdString.replaceAll("\\s", "").toCharArray()) {
	        if ((Integer)map.get(character) == 1) {
	            System.out.println(character);
                break;
	        }
        }
	}
}
