package function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import predicate.Employee;

public class FunctionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> employees = Arrays.asList(
				new Employee("Mg Mg", "admin"),
				new Employee("Kyaw Kyaw", "staff"),
				new Employee("Zaw Zaw", "manger"),
				new Employee("Ma Sapal", "staff"),
				new Employee("Hein Hein", "admin"),
				new Employee("Kyi Pyar", "staff"),
				new Employee("YE YE", "manger"),
				new Employee("Kyal Sin", "staff")
				    );
		
		Function<Employee, String> nameFunc = e -> e.getName();
		Function<String, String> initialLetter = s->String.valueOf(s.charAt(0));
		
		Function<Employee, Employee> setFirstName = e-> {
			int index = e.getName().indexOf(" ");
			String firstname = e.getName().substring(0,index);
			e.setName(firstname);
			return e;
		};
		
		List<String> initialLetterList = nameFunction (employees, nameFunc.andThen(initialLetter));
		List<String> fnameList = nameFunction (employees, nameFunc.compose(setFirstName));
		
		for(String temp : initialLetterList)
			System.out.println(temp);
		
		System.out.println();
		
		for(String fname : fnameList)
			System.out.println(fname);
		
	}
	
	static List<String> nameFunction(List<Employee> employees,Function<Employee, String> function){
		
		List<String> resultList = new ArrayList<>();
		
		for(Employee employee : employees) {
			resultList.add(function.apply(employee));
			
		}
		return resultList;
		
	}
	

}
