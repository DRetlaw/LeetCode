/*
 * https://leetcode.com/problems/merge-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150
 * 88. Merge Sorted Array
 */


public class Test0705241 {

    public static void main(String[] args) {
        int []nums1 = {0,0,3,0,0,0,0,0,0}, nums2={-1,1,1,1,2,3};
        int m=3, n=6;
        //int []nums1 = {4,5,6,0,0,0}, nums2 = {1,2,3};
        //int m=3, n=3;
        //int []nums1 = {1,2,3,0,0,0}, nums2 = {2,5,6};
        //int m=3, n=3;
        //int []nums1 = {2,0}, nums2 = {1};
        //int m=1, n=1;
        //int [] nums1 = {0}, nums2 = {1};
        //int m=0, n=1;

        //int [] nums1 = {1}, nums2 = {};
        //int m=1, n=0;
        merge(nums1, m, nums2, n);
        for (int i : nums1) {
            System.out.print(i+",");
        }
        System.out.println("Done!!!");
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums2.length==0)
            return;

        if(m==0)
        {
            for (int i = 0; i < nums2.length; i++) {
                nums1[i]=nums2[i];
            }
            return;
        }

        int nums1Counter=m-1,nums2Counter=n-1, shiftPointer=m+n-1;
        while (nums1Counter>-1 && nums2Counter>-1) {
            if(nums1[nums1Counter]>nums2[nums2Counter])
            {
                nums1[shiftPointer--]=nums1[nums1Counter--];
            }
            else
            {
                nums1[shiftPointer--]=nums2[nums2Counter--];
            }

        }

        while(nums2Counter>=0)
        {

            nums1[shiftPointer--]=nums2[nums2Counter--];
            //System.out.println(nums2Counter);
        }
    }
}
