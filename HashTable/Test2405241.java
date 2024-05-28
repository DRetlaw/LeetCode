/*
 * https://leetcode.com/problems/find-the-difference/description/
 * 389. Find the Difference
 */

import java.util.HashMap;
import java.util.Map;

public class Test2405241 {
    
    public static void main(String[] args) {
        //String s = "abcd";
        //String t = "abcde";
        String s = "a";
        String t = "aa";
        
        System.out.println(findTheDifference(s,t));
        System.out.println("Done!!!");
    }


    public static char findTheDifference(String s, String t) {
        HashMap<Character, Integer> tMap=new HashMap<>();
        char c=' ';
        char[] chArr=t.toCharArray();
        for (char a : chArr) {
            if(!tMap.containsKey(a))
            {
                tMap.put(a, 1);
            }
            else
            {
                int count=tMap.get(a);
                tMap.put(a, count+1);
            }
        }
        System.out.println(tMap);

        chArr=s.toCharArray();
        for (char a : chArr) {
            if(tMap.containsKey(a))
            {
                int count=tMap.get(a);
                if(count==1)
                {
                    tMap.remove(a);
                }
                else
                    tMap.put(a, count-1);
            }
        }

        for (Map.Entry<Character, Integer> entry: tMap.entrySet()) {
            c=entry.getKey();
        }


        System.out.println(c);
        return c;
    }
    
}
