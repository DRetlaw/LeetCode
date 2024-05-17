/*
 * https://leetcode.com/problems/climbing-stairs/description/?envType=study-plan-v2&envId=top-interview-150
 * 70. Climbing Stairs
 */

import java.util.List;

public class Test0605242 {

    public static void main(String[] args) {
        int n = 6;
        System.out.println(climbStairs(0, n));
        System.out.println("Done!!!");
    }

    public static int climbStairs(int count, int n) {
        if(count>=n)
            return count;
        
        climbStairs(count+1,n);
        climbStairs(count+2,n);
        
        System.out.println(count);
        return count;

        //climbStairs(count+2,n);
        //return 0;
    }
}
