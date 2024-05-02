/*
 * https://leetcode.com/problems/find-the-highest-altitude/?envType=study-plan-v2&envId=leetcode-75
 * 1732. Find the Highest Altitude
 */

public class Test0104242 {

    public static void main(String[] args) {
        //int [] gain = {1,7,3,6,5,6};
        int []gain = {-4,-3,-2,-1,4,3,2};
        //int [] gain = {-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));
        System.out.println("Done!!!");
    }

    public static int largestAltitude(int[] gain) {
        int highestGain=0, gainSum=0;
        for (int i = 0; i < gain.length; i++) {
            gainSum+=gain[i];
            if(gainSum>highestGain)
                highestGain=gainSum;
        }
        return highestGain;
    }
}
