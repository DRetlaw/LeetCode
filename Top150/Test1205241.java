/*
 * https://leetcode.com/problems/same-tree/description/
 * 100. Same Tree
 */


public class Test1205241 {

    public static void main(String[] args) {
        //int x=4;
        int x=10;
        System.out.println(mySqrt(x));
        System.out.println("Done!!!");
    }

    public static int mySqrt(int x) {
        if(x<=1)
            return x;
        
        int result=1,ans=0, i=2 ;
        for (; result<=x; i++) {
            result=i*i;
            if(result == x)
            {
                ans=i;
                return ans;
            }
        }
        ans=i-2;
        return ans;
    }
}
