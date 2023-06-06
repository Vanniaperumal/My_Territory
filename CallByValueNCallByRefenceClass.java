package JavaPrograms;

public class CallByValueNCallByRefenceClass {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int a = 50;
 int b = 35;

 swapMethod(a, b);
 System.out.println("a : " +a + "    " + "b  :" +b);
 
	}
	
	public static void swapMethod(int a, int b) {
		int c = a;
		a = b;
		b= c;
	}

}
