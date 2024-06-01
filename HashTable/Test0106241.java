/*
 * https://leetcode.com/problems/longest-palindrome/
 * 409. Longest Palindrome
 * Easy
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test0106241 { 
    public static void main(String[] args) {
        //String words[] = {"Alaska"};
        String word = "abccccdd";
        System.out.println(longestPalindrome(word));
        System.out.println("Done!!!");
    }

    public static int longestPalindrome(String s) {
        if(s.length()==0)
            return 0;
        
        HashMap<Character, Integer> chars=new HashMap<>();
        for (Character c : s.toCharArray()) {
            if (chars.get(c)==null) {
                chars.put(c, 1);
            }
            else
                chars.put(c, chars.get(c)+1);
        }

        int count=0;
        boolean isFirstOdd=true;

        for(Integer value: chars.values())
        {
            if(value%2==0)
                count+=value;
            else
                if(value==1)
                {
                    
                    if(isFirstOdd)
                    {
                        count++;
                        isFirstOdd=false;
                    }
                }
                else
                    if(value>1)
                    {
                        count+=(value-1);
                        if(isFirstOdd)
                        {
                            isFirstOdd=false;
                            count++;
                        }
                    }
            System.out.println(value);
        }
        return count;
    }
    
}
