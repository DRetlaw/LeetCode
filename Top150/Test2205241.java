/*
 * https://leetcode.com/problems/intersection-of-two-arrays/description/
 * 349. Intersection of Two Arrays
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test2205241 {
    
    public static void main(String[] args) {
        int nums1 []= {1,2,2,1}, nums2 []= {2,2};
        //int nums []= {0,1};
        //int nums []= {1,2,3,4};
        System.out.println(intersection(nums1,nums2));
        System.out.println("Done!!!");
    }


    public static int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> nums1Map=new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            if(nums1Map.get(nums1[i])==null)
            {
                nums1Map.put(nums1[i], 1);
            }
        }
        System.out.println(nums1Map);

        ArrayList<Integer> arlNums3 = new ArrayList<>(); 
        for (int i = 0; i < nums2.length; i++) {
            if(nums1Map.get(nums2[i])!=null&&nums1Map.get(nums2[i])==1)
            {
                nums1Map.put(nums2[i], 0);
                arlNums3.add(nums2[i]);
            }
        }
        System.out.println(arlNums3);

        int []nums3=new int[arlNums3.size()];
        int count=0;
        for (Integer i : arlNums3) {
            nums3[count++]=i;
        }
        return nums3;
    }
    
}
