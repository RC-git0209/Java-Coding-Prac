import java.util.stream.IntStream;

public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 5; // Number of rows for the star pattern

        // Generate the pyramid pattern
        IntStream.range(1, rows + 1)
                .forEach(i -> {
                    // Print spaces
                    System.out.print(" ".repeat(rows - i));
                    // Print stars
                    System.out.println("*".repeat(2 * i - 1));
                });
	}

}
