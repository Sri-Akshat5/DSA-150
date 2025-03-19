import java.util.Arrays;

public class Optimized_Merge_sorted_Array {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 6, 0, 0, 0 };
        int arr2[] = { 4, 5, 3 };
        int n = 3;
        int m = arr2.length;

        int i = n - 1; // Last Element of arr1
        int j = m - 1; // Last Element of arr2
        int k = n + m - 1; // Last Place of arr1

        while (i >= 0 && j >= 0) { 
            if (arr1[i] > arr2[j]) { // if ith is big to jth then send ith element to last of kth place
                arr1[k] = arr1[i];
                k--;
                i--;
            } else {                // if ith is small to jth then send jth element to last of kth place
                arr1[k] = arr2[j];
                k--;
                j--;
            }
        }
        while (j >= 0) {
            arr1[k] = arr2[j];
            k--;
            j--;
        }
        System.out.println(Arrays.toString(arr1));
    }
}
