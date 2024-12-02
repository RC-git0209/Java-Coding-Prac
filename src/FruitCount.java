import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FruitCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String fruits = "Apple,Banana,Apple,Cherry,Banana,Cherry,Apple,Grape";
		
		String[] fruitArray = fruits.split(",");
		
		Map<String, Long> fruitCount = Arrays.stream(fruitArray)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		fruitCount.entrySet().stream()
			.filter(entry -> entry.getValue() > 2)
			.forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
	}

}
