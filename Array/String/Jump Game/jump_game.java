public class jump_game {
    public static void main(String[] args)    {
        int[] arr = new int[]{2,3,1,1,4};

        int goal = arr.length-1;
        for(int i =arr.length-1; i>=0; i--){
            if((i + arr[i]) >= goal) goal = i;
        }
        System.out.print(goal == 0);
    }
}
