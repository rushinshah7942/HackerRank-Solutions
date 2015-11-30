public class Anagram
{
	public static boolean anagramCheck(char[] char1,char[] char2)
	{
		int[] b1 = new int[256];
		int[] b2 = new int[256];
		
		if(char1.length!=char2.length)
		{
			return false;
		}
		else
		{
			for(int i=0;i<256;i++)
			{
				b1[i]=0; b2[i]=0;
			}
			for(int i=0;i<char1.length;i++)
			{
				b1[char1[i]]++;
				b2[char2[i]]++;
			}
			for(int i=0;i<256;i++)
			{
				if(b1[i]!=b2[i])
				{
					return false;
				}
			}
		}
		
		
		return true; 
	}
	public static void main(String args[])
	{
		String str1 = "a";
		//Character[] char1 = str1.chars().mapToObj(c->(char)c).toArray(Character[]::new);
		String str2 = "a";
		//Character[] char2 = str2.chars().mapToObj(c->(char)c).toArray(Character[]::new);
		char[] char1 = str1.toCharArray();
		char[] char2 = str2.toCharArray();
		
		boolean check = anagramCheck(char1,char2);
		
		if(check)
		{
			System.out.println("Strings are anagrams");
		}
		else 
			System.out.println("Strings are not anagrams");
	}
}
