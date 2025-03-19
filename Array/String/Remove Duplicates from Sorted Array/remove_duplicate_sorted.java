public class remove_duplicate_sorted{
    public static void main(String args[]){
        int arr[] ={0,0,1,1,1,2,2,3,3,4};
        
        int count=0;
        for(int i=1; i<arr.length; i++){
            if(arr[i]!=arr[count]){     // check ith element to countth element
                arr[count+1] = arr[i]; 
                count++;
            }
        }
        System.out.println(count+1);
        for(int i=0; i<count+1; i++){
            System.out.print(arr[i] + " ");
        }
    }
}