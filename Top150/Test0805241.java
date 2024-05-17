/*
 * https://leetcode.com/problems/plus-one/description/
 * 66. Plus One
 */

public class Test0805241 {

    public static void main(String[] args) {
        int []digits = {1,2,3};
        
        System.out.println(plusOne(digits));
        System.out.println("Done!!!");
    }

    public static int[] plusOne(int[] digits) {
        boolean carryForward = true;
        for (int i=digits.length-1; i>=0 ; i--) {
            if(carryForward)
            {
                if(digits[i]==9)
                {
                    carryForward=true;
                    digits[i]=0;
                    if(i==0)
                    {
                        int temp[] = new int[digits.length+1];
                        temp[0]=1;
                        for (int j = 1; j < temp.length; j++) {
                            temp[j]=digits[j-1];
                        }
                        digits=temp;
                    }
                }
                else
                {
                    digits[i]+=1;
                    carryForward=false;
                }
            }
        }

        for (int i = 0; i < digits.length; i++) {
            System.out.println(digits[i]);
        }
        return digits;
    }
}
