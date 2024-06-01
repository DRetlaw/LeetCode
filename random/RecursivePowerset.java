/*
 * https://leetcode.com/problems/keyboard-row/description/
 * 500. Keyboard Row
 * Easy
 */

public class RecursivePowerset { 
    public static void main(String[] args) {
        //String word = "alaska";
        String word = "abc";
        printPowerset(word,0,"");
        System.out.println("Done!!!");
    }

    public static void printPowerset(String word, int l, String creator) {
        if(l==word.length())
        {
            System.out.println(creator);
            return;
        }

        printPowerset(word,l+1,creator+word.charAt(l));
        printPowerset(word,++l,creator);
    }
    
}
