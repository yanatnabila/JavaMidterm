package datastructure;

public class UseArrayList {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use ArrayList that includes using the add, peek, remove & retrieve methods.
         * Use For-Each loop and While-loop with Iterator to retrieve data.
         *
         * Store and retrieve data from/to a database table.
         */
      UseArrayList<String> al = new UseArrayList<String>();

        System.out.println("Size of UseArrayList:"+al.size());

        al.add("Java");
        al.add("JDBC");
        System.out.println("Elements of first UseArrayList: "+al);

        UseArrayList<String> al2 = new UseArrayList<String>();
        al2.add("EJB");
        al2.add("Struts");
        //Adding the both array
        al2.addAll(al);
        System.out.println("Elements of second UseArrayList: "+al2);

        //remove the element
        al2.remove("EJB");
        System.out.println("Elements of USeArrayList after deletion: "+al2);
        System.out.println("Size of UseArrayList: "+al2.size());

        //Retrieving 2nd index element
        System.out.println("The element at 2nd index is: "+al2.get(2));
    }

}
