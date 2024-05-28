/*
 * https://leetcode.com/problems/intersection-of-two-linked-lists/description/
 * 160. Intersection of Two Linked Lists
 */

import java.util.HashMap;
import java.util.Map;

public class Test2705241 {
    
    public static void main(String[] args) {
        //String s = "abcd";
        //String t = "abcde";
        String s = "a";
        String t = "aa";
        
        System.out.println(findTheDifference(s,t));
        System.out.println("Done!!!");
    }


    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode ans = new ListNode(0);
        Map<Object,Integer> map=new HashMap<>();
        while(headA!=null)
        {
            map.put(headA, headA.val);
            headA=headA.next;
        }
        while(headB!=null)
        {
            if(map.get(headB)==headB)
            {
                ans=headB;
                break;
            }
            headB=headB.next;
        }
        return ans;
    }
    
}
