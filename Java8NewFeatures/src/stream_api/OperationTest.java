package stream_api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class OperationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employeeList = Arrays.asList(
				new Employee ("Kyaw Zaw ",30,400000.0,"Staff"),
				new Employee ("Zaw Zaw ",25,300000.0,"Staff"),
				new Employee ("Myint Myint ",45,1200000.0,"GM"),
				new Employee ("Ma Sapal ",28,350000.0,"HR_Staff"),
				new Employee ("Myo Myint",40,1500000.0,"Manager"),
				new Employee ("Sapal Phyu ",29,1000000.0,"Manager"),
				new Employee ("Tun Tun ",30,400000.0,"Staff"),
				new Employee ("Phyu Pyar ",18,200000.0,"Train"),
				new Employee ("Ko Mg ",30,400000.0,"GM"),
				new Employee ("U Ba Kyaw ",30,3000000.0,"CEO")
				);
		
//		employeeList.stream().map(e->e.getName())
//		        .sorted(Comparator.reverseOrder())
//		        .forEach(System.out :: println);
		
		employeeList.stream().map(e->e.getName())
        .sorted(Comparator.naturalOrder())
        .forEach(System.out :: println);
		
		
//		employeeList.stream().map(e->e.getSalary())
//		        .sorted().forEach(System.out :: println);
		
//		employeeList.stream().skip(5).forEach(System.out :: println);
		
//		employeeList.stream().limit(5).forEach(System.out :: println);
		
//		employeeList.stream().map(e ->e.getAge())
//		        .filter(age ->age >30)
//		        .forEach(System.out :: println);
		
//		double averageSalary = employeeList.stream()
//				.collect(Collectors.averagingDouble(e->e.getSalary()));
//		System.out.println(averageSalary);
		
//		double totalSalary = employeeList.stream()
//				.map(e->e.getSalary())
//				.collect(Collectors.summingDouble(s -> s));
//		double totalSalary = employeeList.stream()
//				.collect(Collectors.summingDouble(e->e.getSalary()));
		
//		double totalSalary = employeeList.stream()
//				.map(e->e.getSalary())
//				.reduce(0.0,(sum, p)->sum+p);
//		
//		System.out.println(totalSalary);
		
//	Map<String, Double> salaryMap = employeeList.stream()
//			.collect(Collectors.toMap(e -> e.getName(), e ->e.getSalary()));
//	
//	System.out.println(salaryMap);
		
		
//		Function<Employee, String> roleFunc =e -> e.getRole();
//		Set<String> roleList = employeeList.stream()
//				.map(roleFunc)
//				.collect(Collectors.toSet());
//		System.out.println(roleList);
		
		
		
		
//		Predicate<Employee> staffFilter = e -> e.getRole().equals("Staff");
//		Predicate<Employee> managerFilter = e -> e.getRole().equals("Manager");
//		
//		List<Employee> managerList = employeeList.stream()
//				.filter(managerFilter)
//				.collect(Collectors.toList());
//		managerList.forEach(System.out :: println);
//		
//		List<Employee> staffList = employeeList.stream()
//				.filter(staffFilter)
//				.collect(Collectors.toList());
//		staffList.forEach(System.out :: println);
//		
//		List<Employee> gmList = employeeList.stream()
//				.filter(e -> e.getRole().equals("GM"))
//				.collect(Collectors.toList());
//		gmList.forEach(System.out :: println);
	}

}
