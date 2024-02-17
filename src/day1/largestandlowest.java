package day1;

public class largestandlowest {

	public static void main(String[] args) {
		int list []= {12,52,65,85,35,365,95,4};
		int largest=list[0];
		int smallest=list[0];
		int secondlargest=list[0];
		for(int i=0;i<list.length;i++) {
			if(list[i]>largest) {
				largest=list[i];
			}
			else if(list[i]<smallest){
				smallest=list[i];
			}
		}
		System.out.println("----------for largest and smallest----------");
		System.out.println(largest);
		System.out.println(smallest);
		
		for(int j=0;j<list.length;j++) {
			if(list[j]>largest) {
				secondlargest=largest;
				largest=list[j];
			}
			else if(list[j]>secondlargest && list[j] !=largest){
				secondlargest=list[j];
				
			}
		}
		System.out.println("------for largeat and secondlargest---------");
		System.out.println(secondlargest);
		
		
		int missing[]= {1,2,3,4,5,6,7,8,10};
		int sum=0;
		int sum1=0;
		for(int k=0;k<missing.length;k++) {
			sum=sum+k;
		}
		for(int l=0;l<10;l++) {
			sum1=sum1+l;	
		}
		System.out.println("--------for missing number-------");
		System.out.println(sum);
		System.out.println(sum1);
		System.out.println(sum1-sum);
		System.out.println("-------for missing with method decleraction-------");
		int miss[]= {1,2,3,4,5,6,8,9,10,11};
		int n1= missingnumber(miss,11);
		System.out.println(n1);
		largestandlowest abj=new largestandlowest();
		abj.multiplemissing();
		System.out.println("-----convert double to int-----");
		double d=22.5;
		int e=(int)d;
		System.out.println(e);


}
	public static int missingnumber(int miss[],int totalcount) {
		int expect=totalcount*(totalcount+1)/2;
		int actual=0;
		for(int i:miss) {
			actual +=i;
		}
		System.out.println(totalcount*(totalcount+1)/2);
		System.out.println(expect);
		System.out.println(actual);
		return expect-actual;
		
	}
	
	public void multiplemissing() {
		System.out.println("-------for multiple missing number-----");
		int array[]= {1,1,2,2,3,3,5,5,8,8,9};
		int newlist[]=new int[array.length];
		for(int i:array) {
			newlist[i]=1;
		}
		for(int i=1;i<newlist.length;i++) {
			if(newlist[i]==0) {
				System.out.println(i);
			}
		}
	}

}
