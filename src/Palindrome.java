import java.util.stream.IntStream;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "radar";
		boolean isPalindrome = isPalindrome(input);
		System.out.println("Is \"" + input + "\" a palindrome?" + isPalindrome);
		
	}
	public static boolean isPalindrome(String str) {
		if (str == null || str.isEmpty()) {
			return false;
		}
		String lowerCased = str.toLowerCase();
		return IntStream.range(0, lowerCased.length() / 2)
				.allMatch(i -> lowerCased.charAt(i) == lowerCased.charAt(lowerCased.length() - 1 -i));
	}

}
