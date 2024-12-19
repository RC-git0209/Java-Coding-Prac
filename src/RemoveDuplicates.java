import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
	public static String removeDuplicates(String s) {
		Set<Character> seen = new LinkedHashSet<>();
		StringBuilder result = new StringBuilder();
		
		for (char c : s.toCharArray()) {
			if(seen.add(c)) {
				result.append(c);
			}
		}
		
		return result.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "AppleeRaaamShyaammWooraa";
		String result = removeDuplicates(s);
		System.out.println("Original String: " + s);
		System.out.println("String after removing Duplicates: " + result);
	}

}
