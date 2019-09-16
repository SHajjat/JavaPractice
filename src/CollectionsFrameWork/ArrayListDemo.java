package CollectionsFrameWork;

import java.util.*;

import static javafx.scene.input.KeyCode.T;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String > cars= new ArrayList<>(100);//initial capacity
		cars.add("BMW");
		cars.add("Honda");
		cars.add("Audi");
		
		int size = cars.size();
		
		System.out.println("size = " + size);
		cars.get(1);
		cars.get(Integer.valueOf(1));
		
		ListIterator iterator = cars.listIterator();
		while (iterator.hasNext()){
			System.out.println(iterator.next());
		}
		while (iterator.hasPrevious()){
			System.out.println(iterator.previous());
		}
		//  cars.sort(Comparator<T>);
		
		
		
	}
}
