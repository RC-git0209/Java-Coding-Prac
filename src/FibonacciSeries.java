import java.util.stream.Stream;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int limit = 20;
		generateFibonacci(limit).forEach(System.out::println);
	}
	
	public static Stream<Long> generateFibonacci (int limit) {
		return Stream.iterate(new long[] {0,1}, fib -> new long[] {fib[1], fib[0] + fib[1]})
				.limit(limit)
				.map(fib -> fib[0]); 
	}

}
