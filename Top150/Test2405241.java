/*
 * https://leetcode.com/problems/missing-number/description/
 * 268. Missing Number
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test2405241 {
    
    public static void main(String[] args) {
        //String s = "leetcode";
        //String s = "loveleetcode";
        String s = "aabb";
        System.out.println(firstUniqChar(s));
        System.out.println("Done!!!");
    }


    public static int firstUniqChar(String s) {
        Map<Character,Integer> m=new HashMap<>();
        char[] sArr = s.toCharArray();
        for (char c : sArr) {
            if(m.containsKey(c))
            {
                int t=m.get(c);
                m.put(c,++t);
            }
            else
                m.put(c, 1);
        }
        System.out.println(m);
        int t=0;
        for (char c : sArr) {
            if(m.get(c)==1)
            {
                return t;
            }
            t++;
        }
        return -1;
    }
    
}
