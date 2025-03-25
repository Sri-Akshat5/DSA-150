
public class lenoflastword {
    public static void main(String[] args){
        String s = "luffy is still joyboy";

        int n = s.length()-1;
        int length=0;
        for(int i =n; i>=0; i--){
            if(s.charAt(i)!=' ') length++;
            else if(length > 0) break;
        }
        System.out.print(length);
    }
}
