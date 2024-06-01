/*
 * https://leetcode.com/problems/keyboard-row/description/
 * 500. Keyboard Row
 * Easy
 */

public class RecursivePalindrome { 
    public static void main(String[] args) {
        String word = "alaska";
        //String word = "abba";
        System.out.println(checkPalindrome(word,0,word.length()-1));
        System.out.println("Done!!!");
    }

    public static boolean checkPalindrome(String word, int l, int r) {
        if(l>=r)
            return true;
        if(word.charAt(l)!=word.charAt(r))
            return false;
        
        return checkPalindrome(word,++l,--r);
    }
    
}
