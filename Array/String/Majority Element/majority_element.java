import java.util.*;
public class majority_element {
    public static void main(String args[]){
        int arr[] = new int[]{2,2,1,1,1,2,2};

        Arrays.sort(arr);
        System.out.print(arr[arr.length/2]);
    }
}
