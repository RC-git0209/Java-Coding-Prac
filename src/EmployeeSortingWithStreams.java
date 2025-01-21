import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Collections;

public class EmployeeSortingWithStreams {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1, "Ali", 50000));
		employees.add(new Employee(2, "Shayam", 10000));
		employees.add(new Employee(3, "Ram", 80000));
		employees.add(new Employee(4, "Sam", 550000));
		employees.add(new Employee(5, "Mohan", 40000));
		
		
		List<Employee> sortedByName = employees.stream()
				.sorted(Comparator.comparing(Employee::getName))
				.collect(Collectors.toList());
		
		System.out.println("Sorted By Name" + sortedByName);
		
		
		List<Employee> sortedBySalary = employees.stream()
				.sorted(Comparator.comparingDouble(Employee::getSalary))
				.collect(Collectors.toList());
		
		System.out.println("Sorted By Salary" + sortedBySalary);
		
		
		List<Employee> sortedByNameThenSalary = employees.stream()
				.sorted(Comparator.comparing(Employee::getName)
				.thenComparingDouble(Employee::getSalary))
				.collect(Collectors.toList());
		
		System.out.println("Sorted By Name then Salary" + sortedByNameThenSalary);

	}

}
