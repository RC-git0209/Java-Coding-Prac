import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s = "My Name is Rohan, I am a Java Fullstack Developer";
		//String reverse = reverseSentence(s);
		//System.out.println("Reveresed sentence: \"" + reverse + "\"");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String: ");
		String s = sc.nextLine();
		String o = reverseSentence(s);
		
		//System.out.println("Input String: " + s);
		System.out.println("Output String: " + o); 
		
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
