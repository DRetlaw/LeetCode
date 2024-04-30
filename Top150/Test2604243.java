import java.util.HashMap;
import java.util.Map;

/*
 * https://leetcode.com/problems/divide-two-integers/solutions/1327339/java-0ms-100-faster-obeys-all-conditions/?envType=list&envId=e5vjd5xs
 * 29. Divide Two Integers
 * NOT SOLVED
 */

public class Test2604243 {

    public static void main(String[] args) {
        //String s = "anagram", t = "nagaram";
        //int dividend = 10, divisor = 3;
        int dividend = 7, divisor = -3;
        
        System.out.println(divide(dividend, divisor));
        System.out.println("Done!!!");
    }
    public static int divide(int dividend, int divisor) {
        int quotient=0;
        if(divisor<0)
        {
            divisor *= -1; 
        }


        while(dividend>divisor)
        {
            dividend -= divisor;
            quotient++;
        }
        if(divisor<0)
        {
            quotient *= -1; 
        }
        return quotient;
    }
    
}
