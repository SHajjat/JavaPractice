package ReflectionExample;

import java.lang.reflect.Method;

public class Home {
	public static void main(String[] args) {
		Test t = new Test();
		Class clazz = t.getClass();
		System.out.println(clazz.getSimpleName());
		Method[] methods = clazz.getDeclaredMethods();
		System.out.println(methods.length);
		for (Method method :methods){
			System.out.println(method.getName());
			System.out.println(method.getModifiers());
			
		}
	}
}
