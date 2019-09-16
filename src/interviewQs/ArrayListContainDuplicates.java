package interviewQs;

import java.util.*;

public class ArrayListContainDuplicates {
	public static void main(String[] args) {
		//how do you find if arrayList contains duplicates or not
		List<Integer> arrlist = new ArrayList<>();
		arrlist.add(1);arrlist.add(2);arrlist.add(1);arrlist.add(3);arrlist.add(4);
		System.out.println(containsDuplicateTest3(arrlist));
	}
	
		//first way
		public static synchronized boolean containsDuplicateTest1(List<Integer> arrlist) {
			
			if ( arrlist.size() - arrlist.stream().distinct().count() != 0 ) {
				System.out.println("there is duplicates");
				return false;
			} else {
				System.out.println("thers is no duplicates");
				return true;
			}
		}
		//second way
	public static boolean containsDuplicateTest2(List <Integer>arrlist) {
		Set<Integer> setlist = new HashSet<>();
		for ( Integer arr : arrlist ) {
			if ( setlist.add(arr) ) {
				System.out.println("there is duplicates");
				return false;
			}
		}
		return true;
	}
		
		public static boolean containsDuplicateTest3(List <Integer>arrlist){
			Set<Integer> set = new HashSet<>();
			return arrlist.stream().allMatch(t->set.add(t));
		}
		
	
}
