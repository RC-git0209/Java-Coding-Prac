import java.util.*;
import java.util.stream.Collectors;

public class Employees {
	private int id;
	private String name;
	private String department;
	private double salary;
	
	//Constructor
	public Employees(int id, String name, String department, double salary) {
			this.id = id;
			this.name = name;
			this.department = department;
			this.salary = salary;
	}
	
	//Getters
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public double getSalary() {
		return salary;
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(department, id, name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employees other = (Employees) obj;
		return Objects.equals(department, other.department) && id == other.id && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}

	@Override
	public String toString() {
		return "Employee{" +
				 "id=" + id +
				 ", name='" + name + '\'' + 
				 ", department='" + department + '\'' +
				 ", salary=" + salary +
				'}';
	}

}

