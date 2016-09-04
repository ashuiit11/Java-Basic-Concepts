class Super_Class{
	int number = 20;
	public void display(){
		System.out.println("Hello from SUPER class");
	}
}
public class Super_Inheritance extends Super_Class{
	int number = 10;
	public void display(){
		System.out.println("Hello from SUB class");
	}

	public void result(){
		//Instantiating subclass
		// no need to intansiating a subclass
      Super_Inheritance sub = new Super_Inheritance();
	  
      //Invoking the display() method of sub class
      sub.display();
	  
      //Invoking the display() method of superclass
      super.display();
	  
      //printing the value of variable num of subclass
      System.out.println("value of the variable named number in sub class:"+ sub.number);
		  
      //printing the value of variable num of superclass
      System.out.println("value of the variable named number in super class:"+ super.number);
	}
	public static void main(String[] args){
		Super_Inheritance inheritedClass = new Super_Inheritance();

		inheritedClass.result();
	}

}