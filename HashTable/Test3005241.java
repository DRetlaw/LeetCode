/*
 * https://leetcode.com/problems/find-the-number-of-good-pairs-i/description/
 * 3162. Find the Number of Good Pairs I
 * Easy
 */
public class Test3005241 { 
    public static void main(String[] args) {
        //int nums[] = {3,2,1,0,4};
        int k=3;
        int nums1[] = {1,2,4,12}, nums2[] = {2,4};
        System.out.println(numberOfPairs(nums1, nums2, k));
        System.out.println("Done!!!");
    }

    public static int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int count=0;
        for (int i = 0; i < nums2.length; i++) {
            nums2[i]=nums2[i]*k;
            System.out.println(nums2[i]);
        }

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                System.out.println(nums1[i]%nums2[j]);
                if(nums1[i]%nums2[j]==0)
                    count++;
            }
        }
        return count;
    }
    
}
