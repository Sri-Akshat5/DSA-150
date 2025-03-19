
public class buy_Sell_Stock_2 {
    public static void main(String[] args)    {
        int arr[] = new int[]{7,1,5,3,6,4};

        if(arr.length==1) System.out.print("0"); // edge case

        int profit = 0;
        for(int i=1; i<arr.length; i++){
            if((arr[i]-arr[i-1])>0) profit = profit + (arr[i] - arr[i-1]);
        }
        System.out.print(profit);
    }
}
