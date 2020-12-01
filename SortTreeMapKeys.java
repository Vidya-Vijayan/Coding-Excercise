public static void main(String args[]){  
  TreeMap<String,String> tree_map1 = new TreeMap<String,String>(new sort_key());
  
  tree_map1.put("C2", "Red");
  tree_map1.put("C4", "Orange");
  tree_map1.put("C3", "White");
  tree_map1.put("C1", "Black"); 
  System.out.println(tree_map1); 
    }
}
 class sort_key implements Comparator<String>{
     @Override
    public int compare(String str1, String str2) {
        return str1.compareTo(str2);
    }
