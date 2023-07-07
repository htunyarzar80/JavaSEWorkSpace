package predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class RoleFilterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Fixed List

		List<Employee> employees = Arrays.asList(
				new Employee("MgMg", "admin"),
				new Employee("KyawKyaw", "staff"),
				new Employee("ZawZaw", "manger"),
				new Employee("MaSapal", "staff"),
				new Employee("HeinHein", "admin"),
				new Employee("KyiPyar", "staff"),
				new Employee("YEYE", "manger"),
				new Employee("KyalSin", "staff")

				
				);
		Predicate<Employee>  adminFilter = e -> e.getRole().equals("admin");
		Predicate<Employee>  staffFilter = e -> e.getRole().equals("staff");
		Predicate<Employee>  mangerFilter = e -> e.getRole().equals("manger");
		
		List<Employee> adminList = filterRole(adminFilter, employees);
		List<Employee> staffList = filterRole(staffFilter, employees);
		List<Employee> mangerList = filterRole(mangerFilter, employees);
		
		System.out.println("Admin : ");
		System.out.println(adminList);
		System.out.println();
		
		System.out.println("Manger : ");
		System.out.println(mangerList);
		System.out.println();
		
		System.out.println("Staff :");
		System.out.println(staffList);
		System.out.println();
		
		
		
	}
	
	static List<Employee> filterRole(Predicate<Employee> filter,List<Employee> employees){
	List<Employee> filteredList =new ArrayList<>();
	
	for(Employee employee : employees) 
		if(filter.test(employee))
			filteredList.add(employee);
	return filteredList;
	

}
}

