package HashSet;

import java.util.*;

public class HashSetExample {
	public static void main(String[] args) {
		HashSet <String>set = new HashSet<>();
		set.add("Srting");
		set.add("2");
		set.add("String");
		set.add("Srting");
		set.add("hello world");
		set.add("hello world");
		System.out.println(set);
		for( String set1 :set ){
			System.out.println(set1);
		}
		
		Iterator iterator = set.iterator();
		while (iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		System.out.println("********");
		Iterator iterator1 = set.iterator();
		while (iterator1.hasNext()){
			String temp = iterator1.next().toString();
			if(temp.equals("String")){
				System.out.println(temp);
			}
			
		}
		
	}
}
