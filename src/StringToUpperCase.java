
public class StringToUpperCase {
	public static String convertToUppercase(String input) {
		if(input == null || input.isEmpty()) {
			return input;
		}
		
		StringBuilder result = new StringBuilder();
		
		for(char c : input.toCharArray()) {
			// Check if the charcater is lowercase letter
			if (c >= 'a' && c <= 'z') {
				// convert to uppercase by subtracting 32
				result.append((char)(c - 'a' + 'A'));
			}
			else
			{
				result.append(c);
			}
		}
		return result.toString();	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Hello Everyone !!";
		String result = convertToUppercase(input);
		System.out.println("Input: " + input);
		System.out.println("Output: " + result);
		
	}

}
