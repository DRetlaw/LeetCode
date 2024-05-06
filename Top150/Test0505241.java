/*
 * https://leetcode.com/problems/valid-palindrome/description/?envType=study-plan-v2&envId=top-interview-150
 * 125. Valid Palindrome
 */

import java.util.Arrays;

public class Test0505241 {

    public static void main(String[] args) {
        //String s = "A man, a plan, a canal: Panama";
        //String s = "race a car";
        String s = "";
        System.out.println(isPalindrome(s));
        System.out.println("Done!!!");
    }

    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^A-Za-z0-9]", "");
        if(s=="")
            return true;
        s = s.toLowerCase();
        
        for (int i = 0; i < s.length()/2; i++) {//10/2=5,9/2=4
            if(s.charAt(i)!=s.charAt(s.length()-1-i))
            return false;
        }
        System.out.println(s);
        return true;
    }
}
