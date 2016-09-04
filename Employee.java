public class Employee{
	// visible in any child clss
	public String name;
	// will not be visible in child class will be visible only in Employee class
	private int age;

	public Employee(String name){
		this.name = name;
	}

	public void setAge(int age){
		this.age = age;
	}

	public void printInfo(){
		System.out.println("the name of the employee is : " + name);
		System.out.println("age of the employee is : " + age);
	}

	public static void main(String[] args){
		Employee employee = new Employee("shubham");
		employee.setAge(23);
		employee.printInfo();
		System.out.println("Age of the employee is : " + employee.age);
		System.out.println("Name of the employee is : " + employee.name);
	}
}