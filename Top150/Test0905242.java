/*
 * https://leetcode.com/problems/add-binary/description/
 * 67. Add Binary
 */

public class Test0905242 {

    public static void main(String[] args) {
        //String a = "11", b = "1";
        //String a = "1010", b = "1011";
        String a = "1", b = "111";
        System.out.println(addBinary(a,b));
        System.out.println("Done!!!");
    }

    public static String addBinary(String a, String b) {
        int alen = a.length();
        int blen = b.length();

        if(alen==0)
            return b;
        
        if(blen==0)
            return a;
        
        if(blen>alen)
        {
            String temp = a;
            a=b;
            b=temp;
            alen = a.length();
            blen = b.length();
        }

        System.out.println("a="+a);
        System.out.println("b="+b);
        StringBuilder ans=new StringBuilder();
        boolean carry=false;
        char add = '0';
        int j=alen-1;

        for (int i = blen-1; i>=0 ; i--,j--) {
            
            if(a.charAt(j)=='0' && b.charAt(i)=='0')
            {
                if(carry)
                    add='1';
                else
                    add='0';
                carry=false;
            }

            if((a.charAt(j)=='0' && b.charAt(i)=='1') || (a.charAt(j)=='1' && b.charAt(i)=='0'))
            {
                System.out.println("second if");
                System.out.println(a.charAt(j));
                System.out.println(b.charAt(i));
                if(carry)
                {
                    add='0';
                }
                else
                {
                    add='1';
                    carry=false;
                }
            }

            if(a.charAt(j)=='1' && b.charAt(i)=='1')
            {
                if(carry)
                    add='1';
                else
                    add='0';
                carry=true;
            }
        
            System.out.println("add="+add);
            ans.append(add);
            add='0';
        }

        for (int i = j; i>=0; i--) {
            System.out.println("a.charAt(i)-"+a.charAt(i));
            if(carry)
            {
                if(a.charAt(i)=='0')
                {
                    add='1';
                    carry=false;
                }else
                if (a.charAt(i)=='1') {
                    add='0';
                    carry=true;
                }
                ans.append(add);
            }
            else
            {
                ans.append(a.charAt(i));
            }
            
        }
        if(carry)
            ans.append('1');

        return ans.reverse().toString();
    }
}
