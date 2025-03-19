public class buy_Sell_Stock {
    public static void main(String[] args){
        int arr[] = new int[]{7,1,5,3,6,4};

        if(arr.length==1) System.out.print("0"); //edge case

        int maxPrice = 0;
        int buyPrice = arr[0];

        for(int i = 1; i<arr.length; i++){
            if(buyPrice < arr[i]) maxPrice = Math.max(maxPrice, arr[i]-buyPrice);
            buyPrice = Math.min(buyPrice, arr[i]);
        }
        System.out.print(maxPrice);
    }
}
