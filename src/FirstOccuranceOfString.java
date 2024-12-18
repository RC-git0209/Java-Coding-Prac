
public class FirstOccuranceOfString {
	public static int strStr(String haystack, String needle) {
        // Edge case: If needle is empty, return 0
        if (needle.isEmpty()) return 0;
        
        int haystackLength = haystack.length();
        int needleLength = needle.length();
        
        // Loop through the haystack to find the first occurrence of the needle
        for (int i = 0; i <= haystackLength - needleLength; i++) {
            // Check if the substring matches the needle
            if (haystack.substring(i, i + needleLength).equals(needle)) {
                return i; 
            }
        }
        
        return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String haystack1 = "sadbutsad";
        String needle1 = "sad";
        System.out.println("Output: " + strStr(haystack1, needle1)); 

        
        String haystack2 = "leetcode";
        String needle2 = "leet";
        System.out.println("Output: " + strStr(haystack2, needle2)); 
	}

}



