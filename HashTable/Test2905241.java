/*
 * https://leetcode.com/problems/jump-game/description
 * 55. Jump Game 
 * Medium
 */


public class Test2905241 {
    
    public static void main(String[] args) {
        //int nums[] = {3,2,1,0,4};
        int nums[] = {2,3,1,0,0,1,4};
        System.out.println(canJump(nums));
        System.out.println("Done!!!");
    }


    public static boolean canJump(int[] nums) {
        int goal=nums.length-1, gap=0;
        for (int i = nums.length-2;i>=0;i--) {
            if(nums[i]>gap)
            {
                goal=i;
                gap=0;
            }
            else
            {
                gap++;
            }
            System.out.println(nums[i]);
        }
        return (goal==0?true:false);
    }
    
}
