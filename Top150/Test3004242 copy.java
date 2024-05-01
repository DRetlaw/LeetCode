/*
 * https://leetcode.com/problems/is-subsequence/description/?envType=study-plan-v2&envId=leetcode-75
 * 392. Is Subsequence
 */

import java.util.LinkedHashMap;
import java.util.Map;

public class Test3004242 {

    public static void main(String[] args) {
        String s = "abc", t = "ahbgdc";
        //String s = "axc", t = "ahbgdc";
        System.out.println(isSubsequence(s,t));
        System.out.println("Done!!!");
    }
    public static boolean isSubsequence(String s, String t) {
        boolean isSubsequence= true;
        char sArr[] = s.toCharArray();
        char tArr[] = t.toCharArray();
        Map<Integer, Character> sCharMap = new LinkedHashMap<>();
        int counter=1;

        for (char c : sArr) {
            sCharMap.put(counter++,c);
        }
        System.out.println(sCharMap);

        counter = 1;
        for (char c : tArr) {
            if (sCharMap.isEmpty()) {
                break;
            }
            else
            {
                if (sCharMap.get(counter)==c) {
                    sCharMap.remove(counter);
                    counter++;
                }
            }
        }

        if (!sCharMap.isEmpty()) {
            return false;
        }
        
        return isSubsequence;
    }
}
