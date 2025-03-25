

public class findIndexfirstOcc {
    public static void main(String[] args)    {
        String haystack = "sadbutsad", needle = "sad";

        if(needle.isEmpty()) System.out.print("-1");

        int n1 = haystack.length();
        int n2 = needle.length();

        for(int i=0; i<=n1-n2; i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                int j=0;
                while(j<n2 && haystack.charAt(j+i) == needle.charAt(j)){
                    j++;
                }
                if(j==n2) {System.out.print(i);
                break;
                }
                

            }
        }
       
    }
}
