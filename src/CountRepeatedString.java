import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountRepeatedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "aabccddddeee";
		String o = getRepeatedCharacter(s);
		System.out.println(o);
	}
	
	public static String getRepeatedCharacter(String s) {
		if (s == null || s.isEmpty()) {
			return "";
		}
		
		Map<Character, Long> RepeatedMap = s.chars()
				.mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(
						Function.identity(),
						LinkedHashMap::new,
						Collectors.counting()
						));
		
		return RepeatedMap.entrySet()
				.stream()
				.map(entry -> entry.getKey() + "=" + entry.getValue())
				.collect(Collectors.joining(","));
	}

}
