/*
 * https://leetcode.com/problems/search-insert-position/description/
 * 35. Search Insert Position
 */


public class Test0605243 {

    public static void main(String[] args) {
        //int []nums = {1,3,5,6};
        //int target = 5;
        int []nums = {1,3,5,6};
        int target = 2;
        
        System.out.println(searchInsert(nums, target));
        System.out.println("Done!!!");
    }

    public static int searchInsert(int[] nums, int target) {
        int l=0, r=nums.length-1, mid=0;
        while(l<=r)
        {
            mid=(l+r)/2;
            if(nums[mid]==target)
                return mid;
            else
                if(nums[mid]<target)
                {
                    l=mid+1;
                }
                else
                {
                    r=mid-1;
                }
        }
        return l;
    }
}
