/*
 * https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
 * 448. Find All Numbers Disappeared in an Array
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test2305241 {
    
    public static void main(String[] args) {
        int nums []= {4,3,2,7,8,2,3,1};
        //int nums []= {1,1};
        //int nums []= {1,2,3,4};
        System.out.println(findDisappearedNumbers(nums));
        System.out.println("Done!!!");
    }


    public static List<Integer> findDisappearedNumbers(int[] nums) {
        Map<Integer,Integer> numsMap=new HashMap<>();
        int start=nums[0];
        int end=nums.length-1;
        List<Integer> missing=new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            numsMap.put(nums[i], 1);
        }
        System.out.println(numsMap);
        System.out.println(start);
        System.out.println(end);
        for (int i = 0; i<nums.length; i++) {
            if(numsMap.get(i+1)==null)
                missing.add(i+1);
            //System.out.println(i);
        }
        System.out.println(missing);
        return missing;
    }
    
}
