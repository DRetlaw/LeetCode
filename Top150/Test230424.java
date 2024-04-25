import java.util.List;
import java.util.ArrayList;

class Test230424 {

	public static void main(String [] s)
	{
		String [] strs = {"flower","flow","flight"};
		System.out.println(longestCommonPrefix(strs));
		System.out.println("Done!");
	}
    public static String longestCommonPrefix(String[] strs) {
        //System.out.println(strs.length);
		boolean match = true;
        String lcp = "";
		
        for(int i=0;i<strs[0].length();i++)
        {
			char c = strs[0].charAt(i);
			//System.out.println(c);
            for(int j=1;j<strs.length;j++)
            {
				if( i > strs[j].length()-1 || strs[j].charAt(i)!=c)
				{
					match = false;
					break;
				}
            }
			
			if(match)
			{
				lcp+=c;
				match = true;
			}
        }
        
        return lcp;
    }
}