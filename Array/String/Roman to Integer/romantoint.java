public class romantoint {

    public static void main(String[] args) {
        String s = "LVIII";
        int num = 0;
        int sum = 0;

        for(int i = s.length()-1; i>=0; i--){
            switch (s.charAt(i)) {
                case 'I':
                    num = 1; break;
                case 'V':
                    num = 5; break;
                case 'X':
                    num = 10; break;
                case 'L':
                    num = 50; break;
                case 'C':
                    num = 100; break;
                case 'D':
                    num = 500; break;
                case 'M':
                    num = 1000; break;
                default:
                    num = 0; break;
            }
            
            if(num*4 < sum) sum -= num;
            else sum += num;
            System.out.println(sum);

        }
        System.out.println(sum);


    }
}