import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employees> employees = Arrays.asList(
				new Employees(1, "Alice","Technology", 120000),
				new Employees(2, "Dev","HR", 90000),
				new Employees(3, "Sam","Finance", 950000),
				new Employees(4, "Ram","Technology", 110000),
				new Employees(5, "Eve","Technology", 150000)
				);
		
		//Filtering, mapping, and sorting using streams
		List<Employees> result = employees.stream()
			    .filter(emp -> "Technology".equals(emp.getDepartment()) && emp.getSalary() > 100000)
			    .sorted((emp1, emp2) -> Double.compare(emp2.getSalary(), emp1.getSalary()))
			    .collect(Collectors.toList());

		//printng result
		result.forEach(System.out::println);

	}

}
