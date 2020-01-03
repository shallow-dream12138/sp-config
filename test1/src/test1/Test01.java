package test1;

public class Test01 {
	public static void main(String[] args) {
		String s = "tonny";
		Object o = s;
		sayHello(o);
		sayHello(s);
	}
//	public static void sayHello(String to) {
//		System.out.println(String.format("Hello,%s", to));
//	}
	public static void sayHello(Object to) {
		System.out.println(String.format("Welcome,%s", to));
	}
	private class test{
		
	}
}
