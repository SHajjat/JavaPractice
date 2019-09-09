package CollectionsReview.MapConcept;

import CollectionsReview.ListConcept.Employee;
import java.util.*;

public class hashmap {
	public static void main(String[] args) {
		
		
		//HashMap is a class implements Map interface
		//extends AbstractMap
		//it contains only unique elemnts
		//stroes the values - key - value pair
		//it may have one null key and multiple null values
		//it maintains no order
		//HashMap is non-synchronised -- no thread safty
		
		//concurrent modification exception -- fail - fast condition
		//when one thread is modifing a map and the other is trying to access it
		
		HashMap<Integer,String> hm = new HashMap<>();
		hm.put(1,"first");
		hm.put(2,"Second");
		hm.put(3,"Three");
		System.out.println(hm.get(1));
		System.out.println(hm.get(5));
		for( Map.Entry s : hm.entrySet()){
			System.out.println(s);
			
		}
		
		for ( Map.Entry s : hm.entrySet()){
			System.out.println(s.getKey() + " "+ s.getValue());
		
		}
		
		Map <Integer , String > map = new HashMap<>();
		
		for ( Map.Entry m : map.entrySet()){
		
		}
		
		hm.remove(2);
		System.out.println(hm);
		
		Set <Integer> keys = hm.keySet();
		
		for (Integer key : keys){
			System.out.println(hm.get(key));
		}
		
		
		for ( Map.Entry key: hm.entrySet()) {
			System.out.println(key);
			
		}
		
		
		Map <Integer , Employee> employeeMap = new HashMap<>();
		Employee employee1 = new Employee("Tom" ,25 , "admin");
		Employee employee2 = new Employee("Steve" ,22 , "QA");
		Employee employee3 = new Employee("Peter" ,25 , "Dev");
		
		employeeMap.put(1,employee1);
		employeeMap.put(2,employee2);
		employeeMap.put(3,employee3);
		
		for (Map.Entry emp: employeeMap.entrySet()) {
			System.out.println(emp);
			System.out.println("Name "+ emp.getKey());
			if(emp.getValue() == employee1) {
				System.out.println(emp.getValue());
				System.out.println(emp.getKey());
				System.out.println("Hello");
			}
		}
		
		
		for ( Map.Entry<Integer,Employee> vales : employeeMap.entrySet() ){
			Integer key = vales.getKey();
			Employee e =vales.getValue();
			System.out.println(e.name);
			System.out.println(e.age);
			System.out.println(e.dept);
		
		}
		
		
		for( Map.Entry<Integer,Employee> employeeEntry : employeeMap.entrySet() ){
			System.out.println(employeeEntry.getValue());
			System.out.println(employeeEntry.getKey());
			Integer key = employeeEntry.getKey();
			Employee employee = employeeEntry.getValue();
			System.out.println(key + " = "+employee.name + employee.age+ " ,  "+employee.dept);
		}
		
	}
}
