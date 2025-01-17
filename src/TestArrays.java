
public class TestArrays {

	public static void main(String[] args) {
		double [] myList = {1.2, 3.9, 4.7, 2.9, 3.5};
		
		//Print all the array element 
		for(int i=0; i< myList.length; i++)
		{
			System.out.println("Print the element in array" + myList[i]);
		}
		
		double total = 0;
		
		for(int i=0; i<myList.length; i++)
		{
			total += myList[i];
		}
		System.out.println("Total is " + total);

	}

}
