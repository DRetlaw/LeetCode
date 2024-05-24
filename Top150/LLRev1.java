/*
 * Practising LL Reversal using Iterative method
 * 
 */

public class LLRev1 { 
    public static void main(String[] args) {
        Tree1 tree=new Tree1(50);
        tree.insertNode(30);
        tree.insertNode(10);
        tree.traverse();
        //tree.reverse();
        tree.reverseRecur();
        tree.traverse();
        System.out.println("Done!!!");
    }
    
}

class Tree1{
    TNode1 head;
    
    Tree1(int val)
    {
        head=new TNode1(val);
    }

    void reverseRecur() {
        head=reverseRecur(head);
    }
    TNode1 reverseRecur(TNode1 head) {
        if(head==null || head.next==null)
            return head;

        TNode1 newHead= reverseRecur(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
    }

    void reverse() {
        TNode1 prev=null;
        TNode1 cur=head;
        TNode1 next=null;

        while(cur!=null)
        {
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        head=prev;
    }

    void insertNode(int val)
    {
        if(head==null)
            head=new TNode1(val);
        TNode1 t=head;
        while(t.next!=null)
            t=t.next;
        t.next=new TNode1(val);
    }

    void traverse()
    {
        TNode1 t=head;
        while(t!=null)
        {
            System.out.print(t.val+"->");
            t=t.next;
        }
        System.out.print("null");
        System.out.println();
    }

    
}

class TNode1{
    int val;
    TNode1 next;
    TNode1(int val)
    {
        this.val=val;
    }
}