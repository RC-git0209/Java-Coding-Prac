
public class AddTwoNumbers {
	
	public static int add(int a, int b ) {
		while(b != 0) {
			int carry = a & b;
			
			a = a ^b;
			
			b = carry << 1;
		}
		return a;
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 15;
        int num2 = 88;
        
        int result = add(num1, num2);
        System.out.println("The sum is: " + result);
	}

}
