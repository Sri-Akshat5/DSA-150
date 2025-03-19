
import java.util.*;
public class Broot_Force_Merge_Sorted_Array {
    public static void main(String [] args){
        int arr1[] = {1,2,3,0,0,0};
        int arr2[] = {4,5,6};
        int n = 3;
        int m = arr2.length;
        for(int i=n, j=0; j<m; j++){
            arr1[i] = arr2[j];
            i++;
        }
        Arrays.sort(arr1); //nlogn
        System.out.println(Arrays.toString(arr1));
    }
}


