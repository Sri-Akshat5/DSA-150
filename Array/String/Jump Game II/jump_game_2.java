

public class jump_game_2 {
    public static void main(String[] args){
        int arr[] = new int[]{1,2,3,4,5,6};

        int lastJump = 0;
        int far = 0;
        int jumpCount =0;

        for(int i =0; i<arr.length-1; i++){
            far = Math.max(far, (i+arr[i]));
            if(i==lastJump){
                jumpCount++;
                lastJump = far;
            }
        }
        System.err.println(jumpCount);
    }
    
}
