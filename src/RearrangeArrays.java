import java.util.Arrays;
public class RearrangeArrays {

	
		public static int[] rearrangeArray(int[] nums) {
			int result[] = new int[nums.length];
			int positiveIndex = 0, negativeIndex = 1;
			
			for(int i=0; i<nums.length; i++) {
				if(nums[i] > 0) {
					result[positiveIndex] = nums[i];
					positiveIndex += 2;
				}
				else {
					result[negativeIndex] = nums[i];
					negativeIndex += 2;
				}
			}
			return result;
		}
		public static void main(String[] args) {
			int [] nums = {3,-2,5,-7,1,-9,0,8};
			int [] rearrangedArray = rearrangeArray(nums);
			//System.out.println("normal array :" + (nums));
			System.out.println("rearranged array :" + Arrays.toString(rearrangedArray));

	}

}