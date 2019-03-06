public class ImplementingClass extends Interface {
	public static void staticMethod() {
		System.out.println("This is a static method");
	}
	
	public void nonStaticMethod() {
		System.out.println("This is a non static method");
	}

	public void methodWithArguments(int num1, int num2, String name) {
		System.out.println("When implementing a method from the interface with arguments
					        you need to have the same arguments");
	}
}
