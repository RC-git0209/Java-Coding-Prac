import java.util.ArrayList;
import java.util.List;

public class SalarySum {

	public static void main(String[] args) {
		List<String> rows = new ArrayList<>();
		rows.add("Name, Department, Salary");
		rows.add("Varun, Finance, 112000.500");
		rows.add("Surbhi, Marketing, 85000");
		rows.add("Ravi, IT, 53000.00");
		
		System.out.println("Print the list: " + rows);
		
		//Calculate the sum of Salaries
		double totalSalary = rows.stream()
				.skip(1)
				.map(row -> row.split(",")[2])
				.map(salary -> salary.replace(",", "").trim())
				.mapToDouble(Double::parseDouble)
				.sum();
		
		System.out.println("Total Salary: " + totalSalary);
	}

}
