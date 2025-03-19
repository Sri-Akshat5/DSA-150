

public class rotate_array {
public static void main(String[] args)  {
    int arr[] = new int[]{1,2,3,4,5,6,7};
    int k=3;

    int temp[] = new int[arr.length];
    for(int i =0; i<arr.length; i++){
        temp[(i+k)%arr.length] = arr[i];
    }
    
    for(int i =0; i<arr.length; i++){
       arr[i]= temp[i];
    }

    for(int x:arr){
        System.out.print(x + " ");
    }
}  
}

