/**
Write a program to get a reverse order view of the keys contained in a given map
*/
public static void main(String args[]) {

  TreeMap <String,String> tree_map1 = new TreeMap <String,String> ();

  tree_map1.put("C2", "Red");
  tree_map1.put("C1", "Orange");
  tree_map1.put("C4", "White");
  tree_map1.put("C3", "Black");

  System.out.println("Actual order: " + tree_map1);
  System.out.println("Reverse order : " + tree_map1.descendingKeySet());
 }
