package javabasics;

class Base {
	void display(){
		System.out.println("Display method");
	}
}

class Child2 extends Base {
	void show(){
		System.out.println("Show method");
	}
}
public class BaseChildUnMatchedMethodCalling {

	public static void main(String[] args) {
		Child2 b = new Child2();
		b.display();
		//we cant call b.show() as show method is not known to "b" reference
	}
}
