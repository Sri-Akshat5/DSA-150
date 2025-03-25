

public class longcommpre {
    public static String common(String s1, String s2){
        int n = Math.min(s1.length(), s2.length());
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<n; i++){
            if(s1.charAt(i) == s2.charAt(i)) sb.append(s1.charAt(i));
            else break;
        }
        return sb.toString();
    }
    public static void main(String[] args)    {
        String[] strs = {"flower","flow","flight"};
        String res = strs[0];

        for(int i=1; i<strs.length; i++){
            res = common(res, strs[i]);
        }
        System.out.print(res);
    }
}
