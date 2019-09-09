package CollectionsReview.ListConcept;

import org.omg.PortableServer.LIFESPAN_POLICY_ID;

import java.lang.reflect.Array;
import java.util.*;

public class ArrayListConcept {
	public static  <E> void main(String[] args) {
		//the properties of arrayList :
		//1. can contain duplicate values/ elements
		//2.maintains insertion order " ordered"
		//3.synchronized , thats why its relatively slow
		//4.allows random access to fetch any element because it stores the values on basis of indexes
		//5. if you want to retrieve all values use for loop or iterator
		int a[] = new int[3]; //the problem with this its fixed " static array"
		
		
		//generic VS non generics
		//1.
		ArrayList ar = new ArrayList();
		ar.add(20);
		ar.add(30);
		ar.add(400);
		System.out.println(ar.size());
		System.out.println(ar);
		ar.add(20);
		ar.add(300);
		System.out.println(ar.size());
		
		for (Object b : ar){
			System.out.print(b + " || ");
		}
		
		Iterator iterator = ar.iterator();
		while (iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		
		//generic VS non generics
		//the <> is called generics
		ArrayList <String> ar2 = new ArrayList<>();
		//ar2.add(1);
		
		
		// if im not sure what kinda of data to use i use E
		ArrayList <E> ar3 = new ArrayList<E>();
		
		
		//Employee class Objects
		Employee c1 = new Employee("Samir" , 27 , "QA");
		Employee c2 = new Employee("Tom" , 23 , "IT");
		Employee c3 = new Employee("Jack" , 50 , "TI");
		Employee c4 = new Employee("Ahmad" , 24 , "FU");
		
		ArrayList<Employee> employees = new ArrayList<>();
		employees.add(c1);
		employees.add(c2);
		employees.add(c3);
		employees.add(c4);
		// ****** used generics in itorator *********
		Iterator <Employee> iterator1 = employees.iterator();
		
		while (iterator1.hasNext()){
			
			Employee emp = iterator1.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
			System.out.println(emp);
		}
		
		
		//****addAll method it will merge two Lists together
		List<String> list = new ArrayList<>();
		list.add("Java");
		list.add("interview");
		list.add("everything");
		
		
		List<String> list2 = new ArrayList<>();
		list2.add("dev");
		list2.add("tester");
		list2.add("SDET");
		
		list.addAll(list2);
		System.out.println(list);
		list.remove(list2);
		
		String [] arr33 = {"1","2","3"};
		list.addAll(Arrays.asList(arr33));
		list.remove(1);
		System.out.println(list);
		
		//retain all
		List<String> list3 = new ArrayList<>();
		list3.add("Java");
		list3.add("Hello");
		list3.add("Hello");
		list.retainAll(list3);//this will give you only what common between two lists
		System.out.println(list);
		
		List <String> list4 = new ArrayList<>(Arrays.asList(arr33));
		System.out.println(list4);
		
		List <String> list5 = new ArrayList<String>(Arrays.asList("1","2","3"));
		list5.remove(1);
		System.out.println(list5);
		
		
		
		
	}
}
