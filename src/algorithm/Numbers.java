package algorithm;

import java.util.List;
import java.util.Random;

import databases.ConnectToSqlDB;

public class Numbers {

    /*
     * Show all the different kind of sorting algorithm by applying into (num array).
     * Display the execution time for each sorting.Example in below.
     *
     * Use any databases[MongoDB, Oracle or MySql] to store data and retrieve data.
     *
     * At the end. After running all the sorting algo, come to a conclusion which one is suitable on given data set.
     *
     */

    public static void main(String[] args) throws Exception {

        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

        int[] num = new int[1000000];
        storeRandomNumbers(num);

        // Selection Sort
        Sort algo = new Sort();
        algo.selectionSort(num);
        long selectionSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Selection Sort took: "
                + selectionSortExecutionTime + " milliseconds");

        connectToSqlDB.insertDataFromArrayToSqlTable(num, "selection_sort", "SortingNumbers");
        List<String> numbers = connectToSqlDB.readDataBase("selection_sort", "SortingNumbers");
        printValue(numbers);

        int n = num.length;
        randomize(num, n);

        // Insertion Sort
        algo.insertionSort(num);
        long insertionSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort took: "
                + insertionSortExecutionTime + " milliseconds");

        /*
         By following the same convention we used for Selection Sort, continue to do the same for all remaining sorting
            algorithms
         */


        /*
        Can you come to conclusion about which sorting algorithm is most efficient, given the size of the data set?
         */

    }




    /*
    HELPER METHODS
     */

    public static void storeRandomNumbers(int[] num) {
        Random rand = new Random();
        for (int i = 0; i < num.length; i++) {
            num[i] = rand.nextInt(1000000);
        }
    }

    public static void randomize(int[] arr, int n) {
        Random r = new Random();
        // Start from the last element and swap one by one. We don't
        // need to run for the first element that's why i > 0
        for (int i = n - 1; i > 0; i--) {
            int j = r.nextInt(i);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void printValue(List<String> array) {
        for (String st:array) {
            System.out.println(st);
        }
    }
}
/////////Sort.java//////////////////
    public class Sort{
    private long startTime,stopTime;
    public long executionTime;

    public void selectionSort(int num[]){
        startTime = System.nanoTime();
        int N = num.length;
        for (int i = 0; i < N-1; i++) {
            int min_idx = i;
            for (int j = i+1; j < N; j++){
                if (num[j] < num[min_idx])
                    min_idx = j;
            }
            int temp = num[min_idx];
            num[min_idx] = num[i];
            num[i] = temp;
        }
        stopTime = System.nanoTime();
        executionTime=stopTime-startTime;
    }
    //---------------------
    public void insertionSort(int num[]){
        startTime = System.nanoTime();
        int n = num.length;
        for (int i = 1; i < n; ++i) {
            int k = num[i];
            int j = i - 1;

            while (j >= 0 && num[j] > k) {
                num[j + 1] = num[j];
                j = j - 1;
            }
            num[j + 1] = k;
        }
        stopTime = System.nanoTime();
        executionTime=stopTime-startTime;
    }
    //------------------------
    public void bubbleSort(int num[]){
        startTime = System.nanoTime();
        int N = num.length;
        for (int i = 0; i < N-1; i++)
            for (int j = 0; j < N-i-1; j++)
                if (num[j] > num[j+1])
                {
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
        stopTime = System.nanoTime();
        executionTime=stopTime-startTime;
    }
}
  //ConnectToSqlDB.java//
import java.sql.*;
        import java.util.*;
public class ConnectToSqlDB{
    private String DATABASE_URL = "jdbc:mysql://localhost:3306/SortingNumbers";
    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;
    private String query;
    public ConnectToSqlDB() {
        try{
            //connect to the database and create the Prepared Statements
            //latest version jdbc driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection=DriverManager.getConnection(DATABASE_URL,"root","christniru");
            statement=connection.createStatement();
        }catch(Exception e){ System.out.println(e);}
    }
    public void insertDataFromArrayToSqlTable(int num[], String sortAlgo, String database){
        //---------------------------------
        try{
            for(int i=0;i<num.length;i++){
                query="insert into "+sortAlgo+"(element) values('"+num[i]+"')";
                statement.executeUpdate(query);
            }
        }catch(Exception e){ System.out.println(e);}
    }
    //---------------------------------------
    public ArrayList<String> readDataBase(String sortAlgo, String database){
        ArrayList<String> list=new ArrayList<String>();
        query="select * from "+sortAlgo;
        try{
            resultSet=statement.executeQuery(query);
            while(resultSet.next()){
                list.add(resultSet.getString(1));
            }
        }catch(Exception e){ System.out.println(e);}
        return list;
    }
}


/Numbers.java/
import java.util.*;
public class Numbers {
    /*
     * Show all the different kind of sorting algorithm by applying into (num array).
     * Display the execution time for each sorting.Example in below.
     *
     * Use any databases[MongoDB, Oracle or MySql] to store data and retrieve data.
     *
     * At the end. After running all the sorting algo, come to a conclusion which one is suitable on given data set.
     *
     */

    public static void main(String[] args) throws Exception {

        int[] num = new int[200];
        storeRandomNumbers(num);
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
//Selection Sort
        Sort algo = new Sort();
        algo.selectionSort(num);
        long selectionSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Selection Sort take: " + selectionSortExecutionTime + " nano sec");
        connectToSqlDB.insertDataFromArrayToSqlTable(num, "selection_sort", "SortingNumbers");
        ArrayList<String> numbers = connectToSqlDB.readDataBase("selection_sort", "SortingNumbers");
//printValue(numbers);
        int n = num.length;

        randomize(num, n);
//Insertion Sort
        algo.insertionSort(num);
        long insertionSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + insertionSortExecutionTime + " nano sec");

        randomize(num, n);
//bubble Sort
        algo.bubbleSort(num);
        long bubbleSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Bubble Sort take: " + bubbleSortExecutionTime + " nano sec");

    }

    //-----------------------
    public static void storeRandomNumbers(int[] num) {
        Random rand = new Random();
        for (int i = 0; i < num.length; i++) {
            num[i] = rand.nextInt(1000000);
        }
    }

    //----------------------------
    public static void randomize(int arr[], int n) {
        Random r = new Random();
// Start from the last element and swap one by one. We don't
// need to run for the first element that's why i > 0
        for (int i = n - 1; i > 0; i--) {
            int j = r.nextInt(i);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    //------------------------
    public static void printValue(ArrayList<String> array) {
        for (String st : array) {
            System.out.println(st);
        }
    }
}