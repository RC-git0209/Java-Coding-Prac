import java.util.Arrays;

public class SecondLargestElement {
	
	static int getSecondLargest(int [] arr)
	{
		int n = arr.length;
		
		int largest = -1, secondLargest = -1;
		
		// Part1 for find secondLargest
		//Arrays.sort(arr);
		
		/*for(int i=n-2; i>=0; i--)
		{
			if(arr[i] != arr[n-1])
			{
				return arr[i];
			}
		}
		return -1;
	}*/
		
		//Part 2 to find secondLArgest
		for(int i=0; i<n; i++)
		{
			if (arr[i] > largest)
				largest = arr[i];
		}
		
		for(int i=0; i<n; i++)
		{
			if(arr[i] > secondLargest && arr[i] != largest)
			{
				secondLargest = arr[i];
			}
		}
		return secondLargest;
	}

	public static void main(String[] args) {
		int arr[] = {2, 45, 76, 34, 9};
		
		System.out.println(getSecondLargest(arr));

	}

}
