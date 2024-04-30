import java.util.HashMap;
import java.util.Map;

/*
 * https://leetcode.com/problems/valid-anagram/?envType=study-plan-v2&envId=top-interview-150
 * 242. Valid Anagram
 */

public class Test2604242 {

    public static void main(String[] args) {
        //String s = "anagram", t = "nagaram";
        String s = "rat", t = "car";
        
        System.out.println(isAnagram(s, t));
        System.out.println("Done!!!");
    }
    public static boolean isAnagram(String s, String t) {
        boolean isAnagram = true;
        char sCharArr[]=s.toCharArray();
        Map<Character, Integer> sCharCount = new HashMap<>();
        for(char c:sCharArr)
        {
            if (sCharCount.containsKey(c)) {
                sCharCount.put(c, sCharCount.get(c)+1);
            }
            else
                sCharCount.put(c, 1);
            
        }
        System.out.println(sCharCount);

        char tCharArr[]=t.toCharArray();
        for(char c:tCharArr)
        {
            if(!sCharCount.containsKey(c))
                return false;
            else
                if(sCharCount.get(c)<1)
                    return false;
                else
                    sCharCount.put(c, sCharCount.get(c)-1);
        }

        return isAnagram;
    }
    
}
