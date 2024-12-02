import java.util.Arrays;

public class IsAnagram {
	
	static boolean areAnagrams(String s1, String s2)
	{
		char[] s1Array = s1.toCharArray();
		char[] s2Array = s2.toCharArray();
		Arrays.sort(s1Array);
		Arrays.sort(s2Array);
		
		return Arrays.equals(s1Array, s2Array);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "radar";
		String s2 = "adarr";
		System.out.println(areAnagrams(s1, s2));
	}

}
