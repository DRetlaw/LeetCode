/*
 * https://leetcode.com/problems/reverse-linked-list/description/
 * 206. Reverse Linked List
 */



public class Test1705241 {
    

    public static void main(String[] args) {
        Tree tree=new Tree(5);
        System.out.println(reverseList(tree.head));
        System.out.println("Done!!!");
    }

    public static ListNode reverseList(TNode head) {
        if(head == null)
            return head;

        ListNode cNode = head;
        ListNode firstNode = reverseList(head, cNode);
        firstNode.next = null;
        return head;
    }

    public static ListNode reverseList(ListNode head, ListNode cNode)
    {
        if(cNode.next == null)
        {
            head = cNode;//last node becomes head
            return cNode;
        }

        ListNode previousNode = reverseList(head, cNode.next);
        previousNode.next = cNode;
        return cNode;
    }

    
}

class Tree{
    TNode head;
    
    Tree(int val)
    {
        head=new TNode(val);
    }

    void insertNode(int val)
    {
        if(head==null)
            head=new TNode(val);
        TNode t=head;
        while(t.next!=null)
            t=t.next;
        t.next=new TNode(val);
    }

    void traverse()
    {
        TNode t=head;
        while(t!=null)
        {
            System.out.print(t.val+"->");
            t=t.next;
        }
        System.out.print("null");
    }

    
}

class TNode{
    int val;
    TNode next;
    TNode(int val)
    {
        this.val=val;
    }
}