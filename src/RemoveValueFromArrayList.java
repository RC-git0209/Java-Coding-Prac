import java.util.ArrayList;

public class RemoveValueFromArrayList {
	
	public static void removeValue(ArrayList<String> list, String valueToRemove) {
		
		if(list.contains(valueToRemove)) {
			list.remove(valueToRemove);
			
			System.out.println(valueToRemove + " has been removed from the list");
		} else {
			System.out.println(valueToRemove + " is not found in the list");
		}
	}

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		//list.add("banana");
		list.add("grape");
		list.add("banana");
		list.add("orange");
		list.add("apple");
		
		System.out.println("Original list" + list);
		
		removeValue(list, "banana");
		
		System.out.println("Updated list" + list);
		
		removeValue(list, "Mango");
	}

}
