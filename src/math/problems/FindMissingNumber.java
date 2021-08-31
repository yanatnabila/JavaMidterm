package math.problems;

public class FindMissingNumber {

    public static void main(String[] args) {
        /*
         If n = 10, then array will have 9 elements in the range from 1 to 10.
            For example {10, 2, 1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).

         Write a method to find the missing number from the array.
         */
        int n=10;

        int[] array= new int[]{10,2,1,4,5,3,7,8,6};
        missingNumber(array,n);
    }
    public static void missingNumber(int[] arr, int n)
    {
        int requiredSum=0;
        int currentSum=0;
        // will calculate sum of all numbers from 1 to 10
        for(int i=1;i<=n;i++)
        {
            requiredSum=requiredSum+i;
        }
        // will calculate sum of elements present in array
        for(int i=0;i<n-1;i++)
        {
            currentSum=currentSum+arr[i];
        }

        System.out.print("Missing Number is: "+(requiredSum-currentSum));
    }
}


