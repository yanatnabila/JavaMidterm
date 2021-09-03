package datastructure;

public class UseArrayList {

  public static void main(String[] args) {
    /*
     * Demonstrate how to use ArrayList that includes using the add, peek, remove & retrieve methods.
     * Use For-Each loop and While-loop with Iterator to retrieve data.
     *
     * Store and retrieve data from/to a database table.
     */


    public static void main (String[]args){

      List<String> list = new ArrayList<String>();

      //Insert ten elements into list
      list.add("One");
      list.add("Two");
      list.add("Thee");
      list.add("Four");
      list.add("Five");
      list.add("Six");
      list.add("Seven");
      list.add("Eight");
      list.add("Nine");
      list.add("Ten");

      System.out.println("FOR EACH LOOP");

      for (String s : list) {
        System.out.println(s);
      }

      System.out.println("WHILE WITH ITERATOR");

      Iterator<String> it = list.listIterator();

      while (it.hasNext()) {
        System.out.println(it.next());
      }
      it = list.listIterator();
      System.out.println("REMOVE ELEMENT");
      while (it.hasNext()) {
        if (it.next().contentEquals("Eight"))
          it.remove();
      }
      it = list.listIterator();
      System.out.println("AFTER REMOVING EIGHT");
      while (it.hasNext()) {
        System.out.println(it.next());
      }
    }
  }
}
