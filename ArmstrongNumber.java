package JavaPrograms;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//program to check palindrom of a number
		
		int sum = 12345;
		int asm = 1634;
		
		int temp = sum;
		int temp1 = asm;
		System.out.println(temp);
		int sum1 = 0;
		int sum2 = 0;
		int a,b;


		System.out.println("Armstrong number");
		while(temp>0) {
			a = temp%10;
			sum1 = (sum1*10)+a;
			temp = temp/10;
		}
		System.out.println(sum1);
		System.out.println();
		
		while(temp1>0) {
			b = temp1%10;
			sum2 = sum2+(b*b*b*b);
			temp1 = temp1/10;
		}
		System.out.println(sum2);
	}
	
	//Program to check armstrong number
	
	

}
