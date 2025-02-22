
public class Person {

	
	String name;
	int age;
	
	Person(String name, int age) {
		this.age = age;
		this.name = name;
	}
	
	public String toString() {
		return this.name + "\n" + this.age + "\n";
	}
	
}
