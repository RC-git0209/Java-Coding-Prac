import java.util.Arrays;

public class PushZerosToEnd {
	
	//function to move all zeros to the end
	static void pushZerosToEnd(int [] arr) {
		int n = arr.length;
		int [] temp = new int[n];
		
		// to keep track of the index in temp[]
		int j = 0;
		
		//copy non-zeros elements to temp[]
		for(int i = 0; i < n; i++) {
			if(arr[i] != 0)
				temp[j++] = arr[i];
		}
		
		
		//Fill remaining positions in temp[] with zeros
 		while (j < n)
			temp[j++] = 0;
		
 		//copy all the elements from temp[] to arr[]
		for (int i = 0; i < n; i++)
			arr[i] = temp[i];
	}

	public static void main(String[] args) {
		int[] arr = {1, 2, 0, 5, 0 , 6, 0, 7, 9};
		pushZerosToEnd(arr);
		
		//print the modified array
		for(int num : arr) {
			System.out.print(num + " ");
		}

	}

}
