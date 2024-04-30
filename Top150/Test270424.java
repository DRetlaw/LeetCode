/*
 * https://leetcode.com/problems/can-place-flowers/description/?envType=study-plan-v2&envId=leetcode-75
 * 605. Can Place Flowers
 */

public class Test270424 {

    public static void main(String[] args) {

        //int flowerbed[] = {1,0,0,0,1}, n = 1;
        //int flowerbed[] = {1,0,0,0,1}, n = 2;
        int flowerbed[] = {1}, n = 0;

        System.out.println(canPlaceFlowers(flowerbed, n));
        System.out.println("Done!!!");
    }
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        boolean possibility = false;
        if(n==0)
            return true;

        if(flowerbed.length<1)
            return false;

        if(flowerbed.length==1 && flowerbed[0]==0 && n<2)
            return true;

        int counter=0;

        if(flowerbed[0]==0 && flowerbed[1]==0)
        {
            flowerbed[0]=1;
            counter++;
        }

        for(int i=1;i<flowerbed.length-1;i++)
        {
            if(flowerbed[i]==0 && flowerbed[i-1]==0 && flowerbed[i+1]==0)
            {
                flowerbed[i]=1;
                counter++;
            }
        }

        if(flowerbed[flowerbed.length-1]==0 && flowerbed[flowerbed.length-2]==0)
            counter++;
        
        System.out.println(counter);
        if(counter>=n)
            possibility = true;
        return possibility;
    }
    
}
