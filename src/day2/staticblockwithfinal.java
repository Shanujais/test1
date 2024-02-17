package day2;

public class staticblockwithfinal {

	public static void main(String[] args) {
		
		System.out.println(neww.X);

	}
	class neww{
	public static final int X=100;
	
	static {
		System.out.println("----main class static block----");
	}
	}

}
