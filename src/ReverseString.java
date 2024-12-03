import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "My Name is Rohan, I am a Java Fullstack Developer";
		String reverse = reverseSentence(s);
		System.out.println("Reveresed sentence: \"" + reverse + "\"");

	}
	
	public static String reverseSentence(String sentence) {
		if (sentence == null || sentence.isEmpty()) {
			return sentence;
		}
		
		List<String> words = Arrays.asList(sentence.split(" "));
		
		return words.stream()
				.collect(Collectors.collectingAndThen(
						Collectors.toList(),
						list -> {
							Collections.reverse(list);
							return list.stream();
						}))
				.collect(Collectors.joining(" ")); 
	}

}
