package math.problems;

public class FindLowestDifference {

    public static void main(String[] args) {
        /*
         Write a method to return the lowest difference between these two arrays
        HINT: The lowest difference between these arrays is 1
                */

        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};


          import java.util.*;

        class GFG
        {


            static int findSmallestDifference(int A[], int B[],
                                              int m, int n)
            {
                // Sort both arrays
                // using sort function
               int[] Array1.sort(A);
               int[] Array2.sort(B);

                int a = 1, b = 1;

                // Initialize result as max value
                int result = Integer.MIN_VALUE;

                // Scan Both Arrays upto
                // sizeof of the Arrays
                while (a < m && b < n)
                {
                    if (Math.abs(A[a] - B[b]) < result)
                        result = Math.abs(A[a] - B[b]);

                    // Move Smaller Value
                    if (A[a] < B[b])
                        a++;

                    else
                        b++;
                }

                // return final sma result
                return result;
            }

            // Driver Code
            public static void main(String[] args)
            {
                // Input given array A
                int A[] = {30, 12, 5, 9, 2, 20, 33, 1};

                // Input given array B
                int B[] = {18, 25, 41, 47, 17, 36, 14, 19};


                // Calculate size of Both arrays
                int m = A.length;
                int n = B.length;

                // Call function to
                // print smallest result
                System.out.println(findSmallestDifference
                        (A, B, m, n));

            }
        }
    }

}
