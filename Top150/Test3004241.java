/*
 * https://leetcode.com/problems/move-zeroes
 * 283. Move Zeroes
 */

import java.util.Stack;

public class Test3004241 {

    public static void main(String[] args) {
        //int []nums = {0,1,0,3,12};//1,0,0,3,12
        //int []nums = {0};
        //int []nums = {1,0};
        int []nums = {1,0,1};
        moveZeroes(nums);
        for(int c=0;c<nums.length;c++)
        System.out.print(nums[c]+",");
        System.out.println("Done!!!");
    }
    public static void moveZeroes(int[] nums) {
        if(nums.length==1)
            return;
        int p1=0,p2=0;
        while(true)
        {
            while(p1<nums.length&&nums[p1]!=0)//finds 0//p1=1
            {
                System.out.println(++p1);
            }
            p2=p1+1;
            while(p2<nums.length&&nums[p2]==0)//finds nonzeroes//p2=4
            {
                System.out.println(++p2);
            }
            System.out.println("p1="+p1+" "+"p2="+p2);

            //if(p1>=nums.length || p2>=nums.length)
                //break;

            if(p1<p2 && p1<nums.length && p2<nums.length)
            {
                int t = nums[p1];
                nums[p1] = nums[p2];
                nums[p2] = t;
            }
            else
                break;
        }
    }
}
