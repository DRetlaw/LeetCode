/*
 * https://leetcode.com/problems/contains-duplicate-ii/description/?envType=study-plan-v2&envId=top-interview-150
 * 219. Contains Duplicate II
 */

import java.util.HashMap;
import java.util.Map;

public class Test0705242 {

    public static void main(String[] args) {
        //int []nums = {1,2,3,1};
        //int k = 3;
        //int []nums = {1,2,3,1,2,3};
        //int k = 2;
        int []nums = {1,0,1,1};
        int k = 1;
        
        System.out.println(containsNearbyDuplicate(nums, k));
        System.out.println("Done!!!");
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map= new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i]))
            {
                if(i-map.get(nums[i])<=k)
                {
                    System.out.println(nums[i]);
                    return true;
                }
                else
                {
                    map.put(nums[i], i);
                }
            }
            else
            {
                map.put(nums[i], i);
            }

        }
        
        return false;
    }
}
