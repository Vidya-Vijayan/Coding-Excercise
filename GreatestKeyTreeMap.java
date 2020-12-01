public static void main(String args[]) {

  TreeMap < Integer, String > tree_map1 = new TreeMap < Integer, String > ();

  tree_map1.put(10, "Red");
  tree_map1.put(20, "Green");
  tree_map1.put(40, "Black");
  tree_map1.put(50, "White");
  tree_map1.put(60, "Pink");

  System.out.println("TreeMap : " + tree_map1);
  System.out.println("Given Entry 10: ");
  System.out.println("Greatest Key : " + tree_map1.floorKey(10));
  System.out.println("Given Entry 30: ");
  System.out.println("Greatest Key : " + tree_map1.floorKey(30));
  System.out.println("Given Entry 70: ");
  System.out.println("Greatest Key : " + tree_map1.floorKey(70));
 }
