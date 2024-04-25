import java.util.HashMap;
import java.util.Map;

public class Test2504243 {

    public static void main(String[] args) {
        String s = "dvdf";
        System.out.println(lengthOfLongestSubstring(s));
        System.out.println("Done!!!");
    }
    public static int lengthOfLongestSubstring(String s) {
        int counter = 0, subCount=Integer.MIN_VALUE;
        Map<Character, Integer> charCount= new HashMap<>();
        char [] sArr = s.toCharArray();
        for(int i=0;i<sArr.length;i++)
        {
            if(charCount.containsKey(sArr[i])==false)
            {
                charCount.put(sArr[i], i);
                counter++;
            }
            else
            {
                int ndx = charCount.get(sArr[i]);
                subCount = Math.max(counter, subCount);
                counter = 0;
                charCount= new HashMap<>();
                i = ndx;
            }
            System.out.println(charCount);
        }
        subCount = Math.max(counter, subCount);
        return subCount;
    }
    
}
