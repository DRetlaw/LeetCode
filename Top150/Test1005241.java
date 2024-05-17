/*
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/
 * 83. Remove Duplicates from Sorted List
 */

public class Test1005241 {

    public static void main(String[] args) {
        //String a = "11", b = "1";
        //String a = "1010", b = "1011";
        //String a = "1", b = "111";
        //SOLVED directly on website
        //System.out.println(deleteDuplicates(head));
        System.out.println("Done!!!");
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null)
            return head;
        
        ListNode temp=head;
        while(temp!=null)
        {            
            if(temp.next!=null && temp.val==temp.next.val)
            {
                    temp.next=temp.next.next;
            }
            else
                temp=temp.next;
            
        }
        return head;
        
    }
}
