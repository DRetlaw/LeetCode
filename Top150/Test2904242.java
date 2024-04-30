/*
 * https://leetcode.com/problems/valid-parentheses/description/
 * 20. Valid Parentheses
 */

import java.util.Stack;

public class Test2904242 {

    public static void main(String[] args) {
        String s = ")[]{}";
        System.out.println(isValid(s));
        System.out.println("Done!!!");
    }
    public static boolean isValid(String s) {
        boolean valid = true;
        Stack<Character> stack = new Stack<>();
        for(char c:s.toCharArray())
        {
            if(c=='('||c=='['||c=='{')
            {
                System.out.println("push"+c);
                stack.push(c);
            }
            else
            {
                if(stack.isEmpty())
                    return false;
                char t = stack.pop();
                System.out.println(t+" "+c);
                if((c==')' && t!='(')||(c==']' && t!='[')||(c=='}' && t!='{'))
                    return false;
            }
        }
        }

        if(!stack.isEmpty())
            return false;
        return valid;
    }
    
}
