package datastructure;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.Stack;

public class DataReader {

    public static void main(String[] args) {
        /*
         * Create an API to read the below textFile and print it to the console.
         *      HINT: Use BufferedReader class
         * Use try-catch block to handle Exceptions
         *
         * Store and retrieve the file to/from a database table.
         *
         * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
         * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
         * order from LinkedList and retrieve as FILO order from Stack.
         *
         * Demonstrate how to use Stack using push, peek, search & pop methods.
         * Use For-Each & While-loop with Iterator to retrieve data.
         */

        String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";
        FileReader filereader = null;
        BufferedReader bufferreader = null;
        String line;
        String store = "";
        try {
            // read file as specified in question using FileReader
            filereader = new FileReader(textFile);
        } catch (FileNotFoundException e) {
            // handle file not found
            e.printStackTrace();
        }

        try {
            // using buffer reader api
            bufferreader = new BufferedReader(filereader);
            while ((line = bufferreader.readLine()) != null) {
                // extract each line
                store += line;

            }
        } catch (Exception e) {
            // handle exception
            System.out.println("Error unable to read");


}
        String[] storeArray = store.split(" ");
       Stack<String> stack = new Stack<String>();
        // empty stack and list
        Stack<String> stack = new Stack<String>();
        LinkedList<String> list = new LinkedList<String>();

        // store each word to stack and list
        for (String element : storeArray) {
            // as specified in question stack add, push to add element
            list.add(element);
            stack.push(element);
        }
        // retrieve FIFO order form linked list
        System.out.println("LinkedList FIFO : ");

        System.out.print (list.remove() + " ");
        while (!list.isEmpty())
            System.out.print (list.remove() + " ");
        System.out.println();
        // since stack if LIFO
        System.out.println("Stack FILO : ");

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + "  ");
        }
        // formatted output
        System.out.println();
    }