/*
 * https://leetcode.com/problems/is-subsequence/description/?envType=study-plan-v2&envId=leetcode-75
 * 392. Is Subsequence
 */

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;

public class Test3004242 {

    public static void main(String[] args) {
        String s = "abc", t = "ahbgdc";
        System.out.println(isSubsequence(s,t));
        System.out.println("Done!!!");
    }
    public static boolean isSubsequence(String s, String t) {
        boolean isSubsequence= true, isCommonChar = false;
        char sArr[] = s.toCharArray();
        char tArr[] = t.toCharArray();
        Map<Character, Integer> sCharMap = new LinkedHashMap<>(); 

        for (char c : sArr) {
            if(sCharMap.containsKey(c))
            {
                int i = sCharMap.get(c);
                sCharMap.put(c, ++i);
            }
            else
            {
                sCharMap.put(c,1);
            }
        }
        System.out.println(sCharMap);
        return isSubsequence;
    }
}
