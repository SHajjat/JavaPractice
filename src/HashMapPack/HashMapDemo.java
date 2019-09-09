package HashMapPack;

import java.util.*;

public class HashMapDemo {
	public static void main(String[] args) {
		Map<String , Integer> map = new HashMap<>();
		map.put("A",1);
		map.put("B",2);
		map.put("C",3);
		map.put("D",4);
		map.put("D",4);
		
		System.out.println(map);
		System.out.println(map.size());
		System.out.println(map.get("a".toUpperCase()));
		
		Set<String> keys = map.keySet();
		
		for(String key:keys){
			System.out.println("Key is "+key+" value "+map.get(key));
		}
		
		Map <String ,List<String>> map1 = new HashMap<>();
		List <String> family = new ArrayList<>();
		family.add("samir hajjat");
		family.add("Amir hajjat");
		family.add("Tamir hajjat");
		family.add("fatima hajjat");
		map1.put("family",family);
	}
}
