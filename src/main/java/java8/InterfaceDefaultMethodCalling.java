package java8;

public class InterfaceDefaultMethodCalling implements Java8Interface {

	@Override
	public void method(int a, int b, int c) {
		Java8Interface.super.method(4,7,8);
	}

	public static void main(String[] args) {
		InterfaceDefaultMethodCalling idmf =new InterfaceDefaultMethodCalling();
		idmf.method(2,3,4);

	}

}
interface Java8Interface{
	default void method(int a,int b,int c){
		System.out.println("sum is : "+(a+b+c));
	}
}
