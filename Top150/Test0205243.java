/*
 * https://leetcode.com/problems/product-of-array-except-self/description/?envType=study-plan-v2&envId=leetcode-75
 * 238. Product of Array Except Self
 */

public class Test0205243 {

    public static void main(String[] args) {
        //int [] nums = {1,2,3,4};
        int [] nums = {-1,1,0,-3,3};
        System.out.println(productExceptSelf(nums));
        System.out.println("Done!!!");
    }

    public static int[] productExceptSelf(int[] nums) {
        int total = 1;
        int ans[] = new int[nums.length];
        for (int i : nums) {
            total*=i;
        }
        for (int i = 0; i < ans.length; i++)
        {
            if(nums[i]==0)
                ans[i] = total;
            else
                ans[i] = total/nums[i];//CANNOT USE DIVISION//NOT SOLVED
        }
        return ans;
    }
}
