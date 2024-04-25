class Test220424 {
	
	public static void main(String []s)
	{
		String str = "hello";
		System.out.println(strStr("mississippi","issipi"));
		
		System.out.println("Done!");
	}
	
	public static int strStr(String haystack, String needle) {
        int startIndex = -1;
        if(haystack.length()<needle.length())
            return -1;
        for(int h1=0,n1=0;h1<=(haystack.length()-needle.length());h1++)
        {
            if(haystack.charAt(h1)==needle.charAt(n1))
            {
                startIndex = h1;
                for(int h2=h1+1, n2=1;n2<needle.length();h2++,n2++)
                {
                    if(haystack.charAt(h2)!=needle.charAt(n2))
                    {
                        startIndex=-1;
                        break;
                    }
                }
                if(startIndex!=-1)
                    break;
            }
        }
        return startIndex;
    }

}