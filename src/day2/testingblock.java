package day2;

import java.util.stream.IntStream;

public class testingblock {

	public static void main(String[] args) {
		//staticblock e=new staticblock();
//		e.test();
		System.out.println(staticblock.a);
		
		printNumWithoutLoop(1);
		printNumWithoutLoop1(15,85);
		
		IntStream.range(1,101).forEach(e->System.out.println(e));

	}
	public static void printNumWithoutLoop(int num) {
		if(num<=100) {
			System.out.println(num);
			num++;
			printNumWithoutLoop(num);
		}
	}
	
	public static void printNumWithoutLoop1(int startnum, int endnum) {
		if(startnum<=endnum) {
			System.out.println(startnum);
			startnum++;
			printNumWithoutLoop1(startnum,endnum);
		}
	}

}
