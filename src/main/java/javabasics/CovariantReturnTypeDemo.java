package javabasics;

class  Parent{
	Number add(int a, int b){
		return a+b;
	}
}

class Child extends Parent {
	Integer add(int a, int b){
		System.out.println("Overridden method");
		return a+b;
	}
}
public class CovariantReturnTypeDemo {
	public static void main(String[] args) {
		Parent p = new Child();
		System.out.println(p.add(5,3));
	}
}
