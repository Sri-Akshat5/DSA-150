

public class remove_ele {
    public static void main(String args[]){
        int arr[] = {0,1,2,2,3,0,4,2};
        int k = 2;

        int count =0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]!=k){
                arr[count]=arr[i];
                count++;
            }
        }
        System.out.println(count);
        for(int i=0; i<count; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
