/*
 * https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/description/
 * 108. Convert Sorted Array to Binary Search Tree
 */

public class Test1405241 {

    public static void main(String[] args) {
        //int x=4;
        String s=" ";
        //String s="42";
        //String s="2";
        //String s="+";
        //String s="  0000000000012345678";
        //String s="-000000000000001";
        //String s="words and 987";
        //String s="-91283472332";
        //String s="+-12";
        //String s="  -42";
        //System.out.println(((long)2147483647+1));
        //System.out.println(Long.parseLong(new StringBuilder("2147483648").toString()));
        System.out.println(myAtoi(s));
        System.out.println("Done!!!");
    }

    public static int myAtoi(String s) {
        if(s.length()==0)
            return 0;
        char [] arr=s.toCharArray();
        int i=0;
        
        //removing whitespaces from the begining of the string
        if(arr[i]==' ')
        {
            while(i<arr.length && arr[i]==' ')
            {
                i++;
            }
            if(i==arr.length)
                return 0;
        }
        
        StringBuilder sb = new StringBuilder();
        //checks if there is more than one +,-
        if((arr[i]=='+'||arr[i]=='-')&&i<arr.length-1&&arr[i+1]<48&&arr[i+1]>57)
        {
            return 0;
        }
        System.out.println("i"+i);

        //checks if i is pointing to + or -
        if(arr[i]=='+'||arr[i]=='-')
        {
            i++;
            if(i==arr.length)
                return 0;
        }
        //adds one + OR -
        
        if(i>0&&(arr[i-1]=='-'||arr[i-1]=='+')&&arr[i]<=57 && arr[i]>=48)
        {
            System.out.println("in");
            sb.append(arr[i-1]);
            //i++;
        }

        System.out.println(arr[i]);
        //adds numeric chars
        while(i<arr.length && arr[i]<=57 && arr[i]>=48)
        {
            sb.append(arr[i++]);
        }
        System.out.println(sb.toString());
        if(sb.toString().isEmpty())
            return 0;

        //remove preceding 0s
        if(sb.toString().charAt(0)=='-')
            sb= new StringBuilder(sb.toString().replaceFirst("^-0+(?!$)", "-"));
        else
            sb= new StringBuilder(sb.toString().replaceFirst("^0+(?!$)", ""));
        //-2,147,483,648 to 2,147,483,647
        if(sb.toString().length()>11)
        {
            if(sb.toString().startsWith("-"))
                return -2147483648;
            else
                return 2147483647;
        }

        long l= Long.parseLong(sb.toString());
        if(l<-2147483648)
            return -2147483648;
        if(l>2147483647)
            return 2147483647;
        return Integer.parseInt(sb.toString());
    }
}
