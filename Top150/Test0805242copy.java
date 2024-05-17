/*
 * https://leetcode.com/problems/add-two-numbers/description/
 * 2. Add Two Numbers
 * NOTSOLVED
 */

import java.math.BigInteger;

public class Test0805242copy {

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
        BigInteger total= new BigInteger("0");
        BigInteger number1 = getListNumber(l1);
        BigInteger number2 = getListNumber(l2);

        total = number1.add(number2);
        //System.out.println(number1);
        //System.out.println(number2);
        //System.out.println("total-"+total);
        LList l3 = new LList();
        while(total.intValue()>0)
        {
            long t = total.intValue()%10;
            l3.insert((int)t);
            total=new BigInteger((total.intValue()/10)+"");
        }
        l3.traverse();
        return l3.head;
    }

    public static BigInteger getListNumber(ListNode node)
    {
        BigInteger place= new BigInteger("1");
        BigInteger total = new BigInteger("0");
        while(node!=null)
        {
            //total+=place*node.val;
            System.out.println("total.intValue()"+total.intValue());
            total=new BigInteger(Integer.toString(total.intValue() + (place.intValue()*node.val)));
            node=node.next;
            //place*=10;
            place=new BigInteger(Integer.toString((place.intValue()) + place.intValue()*10));
            System.out.println(place.intValue());
        }
        System.out.println("total=="+total);
        return total;
    }

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
