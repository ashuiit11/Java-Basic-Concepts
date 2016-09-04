class Animal{
	public void move(){
		System.out.println("animal can move");
	}
}
class Dog extends Animal{
	public void move(){
		System.out.println("dog can walk and run");
	}
}
public class Overriding{

	public static void main(String[] args){
		Animal a = new Animal();
		Animal b = new Dog();
		a.move();
		b.move();
	}
}