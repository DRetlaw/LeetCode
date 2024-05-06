/*
 * https://leetcode.com/problems/successful-pairs-of-spells-and-potions/description/?envType=study-plan-v2&envId=leetcode-75
 * 2300. Successful Pairs of Spells and Potions
 */

import java.util.Arrays;

public class Test0305244 {

    public static void main(String[] args) {
        //int [] nums = {1,2,3,4};
        //int [] spells = {5,1,3}, potions ={1,2,3,4,5};
        int [] spells = {3,1,2}, potions = {8,5,8};
        int success = 16;
        //int success = 7;
        //System.out.println(successfulPairs(spells, potions, success));
        System.out.println((long)(68460*98460));
        System.out.println("Done!!!");
    }

    public static int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int [] pairs = new int[spells.length];
        int len = pairs.length, lo, hi, mid = 0;
        
        for (int i = 0; i < len; i++) {
            lo=0;
            hi=potions.length-1;
            while (lo<=hi) {
                mid = (lo+hi)/2;
                if(spells[i]*potions[mid]>=success)
                    hi = mid -1;
                else
                    lo = mid +1;
            }
            pairs[i]= potions.length-lo;
        }
        return pairs;
    }
}
