/*
 * https://leetcode.com/problems/add-two-numbers/description/
 * 2. Add Two Numbers
 * Approach 2
 */

public class Test0805242 {

    public static void main(String[] args) {
        LList l1=new LList(9);
        LList l2=new LList(1);
        l2.insert(9);
        l2.insert(9);
        l2.insert(9);
        l2.insert(9);
        l2.insert(9);
        l2.insert(9);
        l2.insert(9);
        l2.insert(9);
        l2.insert(9);
        //l1.traverse();
        //l2.traverse();
        addTwoNumbers(l1.head,l2.head);
        System.out.println("Done!!!");
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int total= 0,carry=0;
        ListNode prev=null, temp=null;
        LList l3 = new LList();
        while(l1!=null && l2!=null)
        {
            total=l1.val+l2.val+carry;
            System.out.println(total);
            if(total>9)
            {
                total=total%10;
                carry=1;
            }
            else
            {
                carry=0;
            }

            temp=new ListNode(total);
            if(l3.head==null)
            {
                l3.head = temp;
            }
            else
            {
                prev.next=temp;
            }
            prev = temp;
            

            l1=l1.next;
            l2=l2.next;
        }

        if(l1==null)
        {
            System.out.println("process l2");
            while (l2!=null) {
                total=l2.val+carry;
                System.out.println("l2total"+total);
                if(total>9)
                {
                    total=total%10;
                    carry=1;
                }
                else
                {
                    carry=0;
                }
                temp=new ListNode(total);
                prev.next=temp;
                prev=temp;
                l2=l2.next;
            }
        }
        else
        if(l2==null)
        {
            while (l1!=null) {
                total=l1.val+carry;
                if(total>9)
                {
                    total=total%10;
                    carry=1;
                }
                else
                {
                    carry=0;
                }
                temp=new ListNode(total);
                prev.next=temp;
                prev=temp;
                l1=l1.next;
            }
        }
        if(carry==1)
        {
            temp=new ListNode(carry);
            prev.next=temp;
        }

        l3.traverse();
        return l3.head;
    }

    /*public static int getListNumber(ListNode node)
    {
        int place= 1;
        int total = 0;
        while(node!=null)
        {
            total+=place*node.val;
            node=node.next;
            place*=10;
        }
        return total;
    }*/

}

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

class LList {
    ListNode head;
    LList()
    {}

    LList(int val)
    {
        head = new ListNode(val);
    }

    void insert(int val) {
        ListNode temp = new ListNode(val);
        if(head==null)
        {
            head = temp;
            return;
        }
        
        ListNode node = head;
        while(node.next!=null)
        {
            node=node.next;
        }
        node.next=temp;
    }

    void traverse()
    {
        ListNode node = head;
        while (node!=null) {
            System.out.print(node.val+"->");
            node=node.next;
        }
        System.out.println("null");
    }
}
