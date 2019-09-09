package CollectionsReview.ListConcept;


import java.util.*;

public class LinkedListConcept {
	public static void main(String[] args) {
		LinkedList <String> ll = new LinkedList<>();
		ll.add("test");
		ll.add("dtp");
		ll.add("selenium");
		ll.add("RFT");
		System.out.println("Content of linkedList "+ ll);
		// addfirst
		ll.addFirst("samir");
		ll.addLast("Automation");
		System.out.println("Content of linkedList "+ ll);
		System.out.println(ll.get(0));
		
		//set
		ll.set(0,"Tom");
		System.out.println(ll.get(0));
		System.out.println(ll);
		System.out.println(ll.removeFirst());
		ll.removeLast();
		System.out.println(ll);
		ll.remove(0);
		System.out.println(ll.removeFirstOccurrence("selenium"));
		System.out.println(ll.removeFirstOccurrence("selenium"));
		System.out.println("ll.indexOf(\"dtp\")");
		System.out.println(ll.indexOf("dtp"));
		
		//how to print all the values of LinkedList
		//for loop
		for(int i = 0 ; i<ll.size() ;i++){
			System.out.println(ll.get(i));
		}
		//advanced for loop
		for ( String i:ll ) {
			System.out.println(i);
			
		}
		//itarator
		Iterator<String> iterator = ll.iterator();
		while (iterator.hasNext()){
			System.out.println(iterator.next());
		}
		//while
		ListIterator <String> iterator1 = ll.listIterator();
		while (iterator1.hasNext()){
			System.out.println(iterator1.next());
		}
		
	}
}
