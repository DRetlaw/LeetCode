/*
 * https://leetcode.com/problems/reverse-vowels-of-a-string/description/?envType=study-plan-v2&envId=leetcode-75
 * 345. Reverse Vowels of a String
 */

import java.util.HashMap;
import java.util.Map;

public class Test0205241 {

    public static void main(String[] args) {
        //String s = "hello";
        String s = "ael";
        System.out.println(reverseVowels(s));
        System.out.println("Done!!!");
    }

    public static String reverseVowels(String s) {
        if(s.length()<=1)
            return s;

        int leftPointer = 0;
        int rightPointer = s.length()-1;
        char [] sArr = s.toCharArray();
        Map<Character, Character> map=new HashMap<>();
        map.put('A', 'A');
        map.put('E', 'E');
        map.put('I', 'I');
        map.put('O', 'O');
        map.put('U', 'U');
        map.put('a', 'a');
        map.put('e', 'e');
        map.put('i', 'i');
        map.put('o', 'o');
        map.put('u', 'u');

        while(true)
        {
            while(leftPointer<rightPointer && map.get(sArr[leftPointer])==null)
            {
                leftPointer++;
            }

            while(rightPointer>=leftPointer && map.get(sArr[rightPointer])==null)
            {
                rightPointer--;
            }

           // System.out.println(leftPointer);
            //System.out.println(rightPointer);

            if(rightPointer<=0 || leftPointer>=s.length()||leftPointer>=rightPointer)
                break;

            char temp = sArr[leftPointer];
            sArr[leftPointer] = sArr[rightPointer];
            sArr[rightPointer] = temp;

            leftPointer++;
            rightPointer--;
        }
        s = new String(sArr);
        return s;
    }
}
