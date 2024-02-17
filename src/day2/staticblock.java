package day2;

public class staticblock {
	static int a=5000;
	static {
		System.out.println("static block1");
	}
	
	static {
		System.out.println("static block2");
	}
	
	static {
		System.out.println("static block2");
	}
	public static void test() {
		System.out.println("static test block with public");
	}
	public static void test1() {
		System.out.println("static test1 block with public");
		test();
	}

	public static void main(String[] args) {
		test();
		staticblock.test();
		test1();

	}

}
