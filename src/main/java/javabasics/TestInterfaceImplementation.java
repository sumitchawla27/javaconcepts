package javabasics;

public class TestInterfaceImplementation implements TestInterface{

	@Override
	//while overriding interface methods, we must have to use public access specifier only
	// we can not change that
	public void method1() {
		System.out.println("Method1");
	}
}
