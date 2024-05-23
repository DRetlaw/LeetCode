/*
 * https://leetcode.com/problems/contains-duplicate/description/
 * 217. Contains Duplicate
 */

import java.util.HashMap;
import java.util.Map;

public class Test2105241 {
    
    public static void main(String[] args) {
        int nums []= {1,2,3,1};
        //int nums []= {1,2,3,4};
        System.out.println(containsDuplicate(nums));
        System.out.println("Done!!!");
    }


    public static boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for (int i : nums) {
            if(map.get(i)==null)
            {
                map.put(i, 1);
            }
            else
                return true;
        }
        return false;
    }
    
}
