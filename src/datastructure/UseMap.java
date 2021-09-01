package datastructure;

public class UseMap {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Map that includes storing and retrieving elements.
         * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
         * Use For-Each loop and While-loop with Iterator to retrieve data.
         *
         * Store and retrieve data from/to a database table.
         */
        // create a hashmap with String and a list of String
        HashMap<String, List<String>> map = new HashMap<>();
        // create 3 list.
        // list 1
        List<String> list1 = new ArrayList<>();
        list1.add("list1_data1");
        list1.add("list1_data2");
        list1.add("list1_data3");
        list1.add("list1_data4");

        // list 2
        List<String> list2 = new ArrayList<>();
        list2.add("list2_data1");
        list2.add("list2_data2");
        list2.add("list2_data3");
        list2.add("list2_data4");

        // list 3
        List<String> list3 = new ArrayList<>();
        list3.add("list3_data1");
        list3.add("list3_data2");
        list3.add("list3_data3");
        list3.add("list3_data4");

        // add data into map.
        map.put("1", list1);
        map.put("2", list2);
        map.put("3", list3);
        // create 3 list.
        // list 1
        List<String> list1 = new ArrayList<>();
        list1.add("list1_data1");
        list1.add("list1_data2");
        list1.add("list1_data3");
        list1.add("list1_data4");

        // list 2
        List<String> list2 = new ArrayList<>();
        list2.add("list2_data1");
        list2.add("list2_data2");
        list2.add("list2_data3");
        list2.add("list2_data4");

        // list 3
        List<String> list3 = new ArrayList<>();
        list3.add("list3_data1");
        list3.add("list3_data2");
        list3.add("list3_data3");
        list3.add("list3_data4");

        // add data into map.
        map.put("1", list1);
        map.put("2", list2);
        map.put("3", list3);
        System.out.println();
    }

}
