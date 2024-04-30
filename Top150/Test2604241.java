import java.util.HashMap;
import java.util.Map;

public class Test2604241 {

    public static void main(String[] args) {
        //String pattern = "aaaa", s = "dog cat cat dog";
        String pattern = "abba", s = "dog cat cat dog";
        //String pattern = "abba", s = "dog cat cat fish";
        //String pattern = "abba", s = "dog dog dog dog";
        //String pattern = "aaa", s = "aa aa aa aa";
        
        System.out.println(wordPattern(pattern, s));
        System.out.println("Done!!!");
    }
    public static boolean wordPattern(String pattern, String s) {
        boolean match = true;
        String strArr[] = s.split(" ");
        if(strArr.length!=pattern.length())
            return false;
        int counter = 0;
        Map<Character, String> charPair = new HashMap<>();

        for(char c:pattern.toCharArray())
        {
            if(charPair.containsKey(c))
            {
                if(!charPair.get(c).equals(strArr[counter]))
                {
                    match = false;
                    break;
                }
            }
            else
            {
                if(charPair.containsValue(strArr[counter]))
                {
                    match = false;
                    break;
                }
                else
                    charPair.put(c, strArr[counter]);
            }
            System.out.println(charPair);
            counter++;
        }
        return match;
    }
    
}
