import java.util.HashMap;
import java.util.Map;

public class Test2504242 {

    public static void main(String[] args) {
        //String s = "egg", t = "add";
        //String s = "foo", t = "bar";
        String s = "paper", t = "title";
        System.out.println(isIsomorphic(s, t));
        System.out.println("Done!!!");
    }
    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> pair= new HashMap<>();
        char [] tArr = t.toCharArray();
        int counter = 0;

        for(char c:s.toCharArray())
        {

            if(pair.containsKey(c))
            {
                if(pair.get(c)!=tArr[counter])
                    return false;
            }
            else
            {
                pair.put(c, tArr[counter]);
            }
            counter++;
            System.out.println(pair);
        }
        
        return true;
    }
    
}
