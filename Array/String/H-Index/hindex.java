
public class hindex {
    public static void main(String[] args) {
        int cite[] = new int[]{1,3,1};

        int arr[] = new int[cite.length+1];

        for (int i : cite) {
            if(i>cite.length) arr[cite.length]++;
            else arr[i]++;
        }
        int count = 0;
        for(int i = arr.length-1; i>=0; i--){
            count += arr[i];
            if(count >= i) {System.out.println(i);
                break;}
        }
    }
    
}
