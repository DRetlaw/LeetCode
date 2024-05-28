/*
 * https://leetcode.com/problems/next-greater-element-i/description/
 * 496. Next Greater Element I
 * Not solved
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test2805241 {
    
    public static void main(String[] args) {
        int [] nums1 = {4,1,2}, nums2 = {1,3,4,2};
        
        System.out.println(nextGreaterElement(nums1,nums2));
        System.out.println("Done!!!");
    }


    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[]ans=new int[nums1.length];
        Map<Integer,Integer> numsMap=new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            numsMap.put(nums2[i], i);
        }
        System.out.println(numsMap);
        Arrays.sort(nums2);

        for (int index = 0; index < nums1.length; index++) {
            System.out.println(numsMap.get(nums1[index]));

        }
        return ans;
    }
    
}
