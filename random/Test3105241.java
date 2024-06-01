/*
 * https://leetcode.com/problems/keyboard-row/description/
 * 500. Keyboard Row
 * Easy
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test3105241 { 
    public static void main(String[] args) {
        //String words[] = {"Alaska"};
        String words[] = {"Hello","Alaska","Dad","Peace"};
        System.out.println(findWords(words));
        System.out.println("Done!!!");
    }

    public static String[] findWords(String[] words) {
        List<String> ans=new ArrayList<>();
        Map<Character, Integer> row1=new HashMap<>();
        Map<Character, Integer> row2=new HashMap<>();
        Map<Character, Integer> row3=new HashMap<>();
        row1.put('q', 1);
        row1.put('w', 1);
        row1.put('e', 1);
        row1.put('r', 1);
        row1.put('t', 1);
        row1.put('y', 1);
        row1.put('u', 1);
        row1.put('i', 1);
        row1.put('o', 1);
        row1.put('p', 1);

        row2.put('a', 1);
        row2.put('s', 1);
        row2.put('d', 1);
        row2.put('f', 1);
        row2.put('g', 1);
        row2.put('h', 1);
        row2.put('j', 1);
        row2.put('k', 1);
        row2.put('l', 1);

        row3.put('z', 1);
        row3.put('x', 1);
        row3.put('c', 1);
        row3.put('v', 1);
        row3.put('b', 1);
        row3.put('n', 1);
        row3.put('m', 1);

        Map chosen=null;
        boolean flag=true;
        int count=0;

        for (String string : words) {
            string=string.toLowerCase();
            char [] charArr = string.toCharArray();

            if(row1.get(charArr[0])!=null)
            {
                chosen = row1;
            }
            else
                if(row2.get(charArr[0])!=null)
                {
                    chosen = row2;
                }
                else
                    if(row3.get(charArr[0])!=null)
                    {
                        chosen = row3;
                    }


            for (int i = 1; i < charArr.length; i++) {
                if(chosen.get(charArr[i])==null)
                {
                    flag=false;
                    break;
                }
            }

            if(flag)
            {
                ans.add(words[count]);
            }
            flag=true;
            count++;
        }

        return ans.toArray(new String[0]);
    }
    
}
