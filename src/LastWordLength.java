public class LastWordLength {
	public static int lengthOfLastWord(String s) {
        // Trim any trailing or leading spaces
        s = s.trim();
        
        // Find the last occurrence of a space
        int lastSpaceIndex = s.lastIndexOf(' ');
        
        // Return the length of the last word
        return s.length() - lastSpaceIndex - 1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello World";
        System.out.println("Output: " + lengthOfLastWord(s1)); 

        
        String s2 = "fly me to the moon  ";
        System.out.println("Output: " + lengthOfLastWord(s2)); 

        
        String s3 = "luffy is still joy boy";
        System.out.println("Output: " + lengthOfLastWord(s3)); 
	}
}










