import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedChar {
	
	public static Character findFirstNonRepeatedChar(String s) {
		
		Map<Character, Long> charCountMap = s.chars()
				.mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(
						Function.identity(), LinkedHashMap :: new, Collectors.counting()
						));
		
		return charCountMap.entrySet().stream()
				.filter(entry -> entry.getValue() == 1)
				.map(Map.Entry::getKey)
				.findFirst()
				.orElse(null);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "roohhaann";
		
		Character result = findFirstNonRepeatedChar(s);
		
		if(result != null) {
			System.out.println("The first non-repeated character is:" + result);
		} else {
				System.out.println("No non-repeated character found. new code changes");
			}
		}

}
