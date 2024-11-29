
public class TwoSumArray {
	
	static boolean twoSum (int[] arr, int target) {
		int n = arr.length;
		
		for(int i = 0; i < n; i++) {
			
			for(int j = i + 1; j < n; j++) {
				
				if(arr[i] + arr[j] == target)
				{
					return true;
				}
			}
		}
		return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 0, 1, -3, 3, 2, 0
	};
		int target = -2;
		
		if(twoSum(arr, target))
			
			System.out.println("true");
		else
			System.out.println("false");

}
	
}
