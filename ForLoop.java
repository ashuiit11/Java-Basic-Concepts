public class ForLoop{

	public static void main(String[] args){
		int[] numbers = {1,2,3,4,5};
		String[] strings = {"shubham", "anand", "pratibha", "aarati", "rohit", "pooja"};

		for(int number : numbers){
			System.out.println(number);
			System.out.println(",");
		}
		System.out.println("\n");
		for(String string : strings){
			System.out.println(string);
			System.out.println(",");
		}
	}
}