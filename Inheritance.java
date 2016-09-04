class Calculation{
	// if we make it private then inheritance class wont be able to use this variable
	public int result;
	public void addition(int x, int y){
		result = x + y;
		System.out.println("sum of the given numbers is : " + result);
	}
	public void subtraction(int x, int y){
		result = x - y;
		System.out.println("difference of the given numbers is : " + result);
	}

}
public class Inheritance extends Calculation{

	public void multiplication(int x, int y){
		result = x * y;
		System.out.println("multiplication of the given numbers is : " + result);
	}

	public static void main(String[] args){

		int a = 20, b = 10;
		Inheritance demo = new Inheritance();
		demo.addition(a,b);
		demo.subtraction(a,b);
		demo.multiplication(a,b);
	}

}