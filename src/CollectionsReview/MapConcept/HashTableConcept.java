package CollectionsReview.MapConcept;

import java.util.HashMap;
import java.util.Map;

public class HashTableConcept {
	
	//its similar to hashmap , but its is synchronised
	//stores the value on the basis of key-value
	//key -- > object , hashCode -->value
	
	public static void main(String[] args) {
		Map<String , String> map = new HashMap<>();
		map.putIfAbsent("ss","sa");
		String str = "hey";
		String value = map.containsKey(""+str.charAt(0))? str:map.get(str)+str;
			map.put(str,value);
		System.out.println(map.containsKey(""+str.charAt(0)));
		String [] str1 = {"salt", "tea", "soda", "toast"};
		System.out.println(firstChar(str1));
		
		
	
	}
	
	public Map<String, Integer> wordCount(String[] strings) {
		Map < String , Integer> map = new HashMap<>();
		for(String str : strings){
			if(map.containsKey(str)){
				int count = map.get(str);
				map.put(str,++count);
			}else{
				map.put(str,0);
			}
		}
		return map;
	}
	public static  Map<String, String> firstChar(String[] strings) {
		Map <String , String> map = new HashMap<>();
		for(String str : strings){
			String value = map.containsKey(""+str.charAt(0))?map.get(str)+str:str;
			map.put(""+str.charAt(0),value);
			
			
		}
		return map;
	}
	
	public String wordAppend(String[] strings) {
		String str = "";
		Map <String , Integer > map = new HashMap<>();
		for (int i = 0 ; i<strings.length;i++){
			int value = map.containsKey(strings[i])? map.get(strings[i])+1:1;
			map.put(strings[i],value);
		}
		for(String value : map.keySet()){
			str+= map.get(value) >1?value:"";
		}
		return str;
	}

	
}
