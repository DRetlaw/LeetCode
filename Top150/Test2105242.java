/*
 * https://leetcode.com/problems/missing-number/description/
 * 268. Missing Number
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test2105242 {
    
    public static void main(String[] args) {
        //int nums []= {3,1,2};
        int nums []= {0,1};
        //int nums []= {1,2,3,4};
        System.out.println(missingNumber(nums));
        System.out.println("Done!!!");
    }


    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        for (int i : nums) {
            if(count++!=i)
                return count-1;
        }
        return count;
    }
    
}
