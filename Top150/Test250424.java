import java.util.HashMap;
import java.util.Map;

class Test250424 {
	
	public static void main(String s[])
	{
		
		
		//String ransomNote = "aa", magazine = "ab";
		String ransomNote = "aa", magazine = "aab";
		
		System.out.println(canConstruct(ransomNote, magazine));
		System.out.println("Done!!");
	}

	public static boolean canConstruct(String ransomNote, String magazine) {
		Map <Character, Integer> magMap = new HashMap<>();
		char magCharArr[] = magazine.toCharArray();
		for(int i=0;i<magCharArr.length;i++)
		{
			if(magMap.containsKey(magCharArr[i]))
			{
				magMap.put(magCharArr[i], magMap.get(magCharArr[i])+1);
			}
			else
			{
				magMap.put(magCharArr[i], 1);
			}
		}

		char ranCharArr[] = ransomNote.toCharArray();
		for(int i=0;i<ranCharArr.length;i++)
		{
			if(magMap.get(ranCharArr[i])==null)
			{
				return false;
			}
			else{
				if(magMap.get(ranCharArr[i]) == 1)
				{
					magMap.remove(ranCharArr[i]);
				}
				else
					magMap.put(ranCharArr[i], magMap.get(ranCharArr[i])-1);
			}
		}
		
		
		return true;   
    }
}