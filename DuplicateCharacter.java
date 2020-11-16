/******************************************************************************

Print duplicate characters from string - Take sample string and print all duplicate characters.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter a string");
	    String entrdString = scanner.nextLine();
	    System.out.println("The duplicate characters are : ");
	    Map<Character, Integer> map = new HashMap<Character, Integer>();
	    for(Character character : entrdString.replaceAll("\\s", "").toCharArray()){
	        if(map.containsKey(character)) 
	            map.put(character,(Integer)map.get(character) + 1);
	        else 
	            map.put(character,1);
	    }
	    
	    for (Map.Entry<Character, Integer> entry : map.entrySet()) {
	        if (entry.getValue() > 1) 
            		System.out.println(entry.getKey());
        	}
	}
}
