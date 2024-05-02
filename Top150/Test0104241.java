/*
 * https://leetcode.com/problems/find-pivot-index/description/?envType=study-plan-v2&envId=leetcode-75
 * 724. Find Pivot Index
 */

public class Test0104241 {

    public static void main(String[] args) {
        int [] nums = {1,7,3,6,5,6};
        //int [] nums = {1,1,1,1,1,5,5};
        //String s = "axc", t = "ahbgdc";
        System.out.println(pivotIndex(nums));
        System.out.println("Done!!!");
    }

    public static int pivotIndex(int[] nums) {
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total+=nums[i];
        }

        int leftSum=0,rightSum=0;

        for (int i = 0; i < nums.length; i++) {
            rightSum = total - nums[i] - leftSum;
            if(leftSum == rightSum)
                return i;
            leftSum+=nums[i];
        }
        return -1;
    }
}
