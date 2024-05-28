/*
 * https://leetcode.com/problems/linked-list-cycle/description/
 * 141. Linked List Cycle
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test2805242 {
    
    public static void main(String[] args) {
        System.out.println(hasCycle(head));
        System.out.println("Done!!!");
    }


    public static boolean hasCycle(ListNode head) {
        if(head==null)
            return false;

        Map<ListNode, ListNode> nodeMap=new HashMap<>();

        while(head!=null)
        {
            if(nodeMap.get(head)==null)
                nodeMap.put(head,head);
            else
                return true;
            head=head.next;
        }
        return false;
    }
    
}
