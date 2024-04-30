import java.util.HashMap;
import java.util.Map;

/*
 * https://leetcode.com/problems/reverse-integer/description/
 * 7. Reverse Integer
 */

public class Test2904241 {

    public static void main(String[] args) {
        //int x = 123;
        int x = -123;
        int x = 9646324351;
        
        System.out.println(reverse(x));
        System.out.println("Done!!!");
    }
    public static int reverse(int x) {
        boolean negativeFlag = false;
        if(x>2147483647)
            return 0;

        if(x<0)
        {
            negativeFlag = true;
            x*= -1;
        }
        String s = new String();
        while(x>0)
        {
            s = s + x%10;
            System.out.println(x%10);
            x=x/10;
        }
        System.out.println(s);
        if(negativeFlag)
            s = "-" + s;

        return Integer.parseInt(s);
    }
    
}
