package javabasics;

class Employee implements Cloneable{
	//Cloneable is a marker interface and Clone method is defined in Object class
	// if we remove implements Cloneable from Employee and still define and use
	// clone method, on calling clone method on Employee class object we will get
	/// CloneNotSupportedException
	private String name;
	private int age;

	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public Employee setName(String name) {
		this.name = name;
		return this;
	}

	public int getAge() {
		return age;
	}

	public Employee setAge(int age) {
		this.age = age;
		return this;
	}

	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "Employee{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
public class JavaCloneableClassDemo {
	public static void main(String[] args) throws CloneNotSupportedException {
		Employee employee = new Employee("sumit",26);
		Employee employee2 = (Employee) employee.clone();
		System.out.println(employee);
		System.out.println(employee2);

	}
}
