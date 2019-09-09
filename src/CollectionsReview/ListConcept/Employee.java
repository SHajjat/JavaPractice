package CollectionsReview.ListConcept;

public class Employee {
	public String name;
	public int age;
	public String dept;
	
	public Employee(String name, int age , String dept){
		this.name = name;
		this.age = age;
		this.dept = dept;
		
		
	}
	
	@Override
	public String toString(){
		return "name = "+this.name + " age "+this.age+ " dept "+this.dept;
	}
}
