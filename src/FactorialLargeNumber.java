
public class FactorialLargeNumber {
	public static int trailingZeroes(int n) {
	int count = 0;
	while(n>0) {
		n/=2;
		count += n;
	}
	return count;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Input: n = 3, Output: " + trailingZeroes(3));
		System.out.println("Input: n = 5, Output: " + trailingZeroes(5));
		System.out.println("Input: n = 10, Output: " + trailingZeroes(15));
	}

}
