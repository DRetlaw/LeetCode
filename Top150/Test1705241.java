/*
 * https://leetcode.com/problems/reverse-linked-list/description/
 * 206. Reverse Linked List
 */



public class Test1705241 {
    
static TNode head;
    public static void main(String[] args) {
        Tree tree=new Tree(5);
        tree.insertNode(3);
        tree.insertNode(10);
        tree.traverse();
        TNode lasTNode=reverseList(tree.head);
        lasTNode.next=null;
        tree.head=head;
        tree.traverse();
        //System.out.println(reverseList(tree.head));
        System.out.println("Done!!!");
    }

    // public static TNode reverseList(TNode head) {
    //     if(head == null)
    //         return head;

    //     TNode cNode = head;
    //     TNode firstNode = reverseList(head, cNode);
    //     firstNode.next = null;
    //     return head;
    // }

    public static TNode reverseList(TNode head)
    {
        if(head==null || head.next==null)
            return head;
        
        return reverseList(head, head.next);
    }
    public static TNode reverseList(TNode pNode,TNode cNode)
    {
        if(cNode == null)
        {
            return pNode;
        }

        TNode head=reverseList(cNode,cNode.next);
        cNode.next = pNode;
        return head;
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
        System.out.println();
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