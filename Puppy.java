public class Puppy{
	public int puppyAge;

	public Puppy(String name){
		System.out.println("the name given to puppy is " + name);
	}

	public void setAge(int age){
		puppyAge = age;
	}

	public int getAge(){
		return puppyAge;
	}

	public static void main(String[] args){
		Puppy myPuppy = new Puppy("kutta");
		myPuppy.setAge(3);
		System.out.println("my kutta's age is :" + myPuppy.getAge());
		System.out.println("my kutta's age is :" + myPuppy.puppyAge);
	}

}