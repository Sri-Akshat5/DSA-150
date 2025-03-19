
// Boyer-Moore Voting Algorithm


public class optimized_majority_element {
    public static void main(String[] args) {
        int arr[] = new int[] { 2, 2, 1, 1, 1, 2, 2 };

        int candidate = arr[0];
        int count = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == candidate) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    candidate = arr[i];
                    count = 1;
                }
            }
        }
        System.out.print(candidate);

    }
}
