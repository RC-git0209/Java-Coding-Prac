import java.util.*;
import java.util.stream.Collectors;

public class SortString {

	public static void main(String[] args) {
		List<Map<String, String>> list = Arrays.asList(
				Collections.singletonMap("text", "a"),
				Collections.singletonMap("text", "b"),
				Collections.singletonMap("text", "a"),
				Collections.singletonMap("text", "1"),
				Collections.singletonMap("text", "@"),
				Collections.singletonMap("text", "c"),
				Collections.singletonMap("text", "a"),
				Collections.singletonMap("text", "12")
				);
		
		List<Map<String, String>> sortedList = list.stream()
				.sorted(Comparator.comparing(m -> m.get("text")))
				.collect(Collectors.toList());
		
		sortedList.forEach(System.out::println);

	}

}
