public class trapping_rain_water {
    public static void main(String[] args)    {
        int height [] = {4,2,0,3,2,5};

        int n = height.length;
        
        int left [] = new int[n];
        left[0] = height[0];

        int right[] = new int[n];
        right[n-1] = height[n-1];


        for(int i =1; i<n; i++){
            left[i] = Math.max((left[i-1]), height[i]);
            //System.out.print(left[i] + " ");
        }
        for(int i = n-2; i>=0; i--){
            right[i] = Math.max((right[i+1]), height[i]);
           // System.out.print(right[i] + " ");
        }
        int max=0;
        for(int i=0; i<n; i++){
            max = max + (Math.min(left[i], right[i]) - height[i]);
        }
        System.out.print(max);
    }
}
