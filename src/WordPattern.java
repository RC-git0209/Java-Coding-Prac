

import java.util.HashMap;

public class WordPattern {
	    public static boolean wordPattern(String pattern, String s) {
	        // Split the string s into an array of words
	        String[] words = s.split(" ");
	        
	        // If the number of characters in the pattern doesn't match the number of words, return false
	        if (pattern.length() != words.length) {
	            return false;
	        }
	        
	        // Create two maps to establish a bijection between pattern characters and words
	        HashMap<Character, String> charToWord = new HashMap<>();
	        HashMap<String, Character> wordToChar = new HashMap<>();
	        
	        for (int i = 0; i < pattern.length(); i++) {
	            char c = pattern.charAt(i);
	            String word = words[i];
	            
	            // Check if the character is already mapped to a word
	            if (charToWord.containsKey(c)) {
	                if (!charToWord.get(c).equals(word)) {
	                    return false;
	                }
	            } else {
	                charToWord.put(c, word);
	            }
	            
	            // Check if the word is already mapped to a character
	            if (wordToChar.containsKey(word)) {
	                if (!wordToChar.get(word).equals(c)) {
	                    return false;
	                }
	            } else {
	                wordToChar.put(word, c);
	            }
	        }
	        
	        // If no conflicts arise, the string follows the pattern
	        return true;
	    }

	    public static void main(String[] args) {
	        // Test cases
	        System.out.println(wordPattern("abba", "dog cat cat dog")); // true
	        System.out.println(wordPattern("abba", "dog cat cat fish")); // false
	        System.out.println(wordPattern("aaaa", "dog cat cat dog")); // false
	        System.out.println(wordPattern("abba", "dog dog dog dog")); // false
	    }
}
	
