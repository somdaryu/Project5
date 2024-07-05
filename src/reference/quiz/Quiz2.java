package reference.quiz;

public class Quiz2 {

	public static void main(String[] args) {
		Employee name1 = new Employee("또치", 40, 500, 4);
		Employee name2 = new Employee("둘리", 30, 300, 3);
		Employee name3 = new Employee("도우너", 30, 300, 2);
		
		Department part = new Department(name1, name2, name3);
	}

}

class Employee {
	String name;
	int age;
	int pay;
	int yearsOf;
	
	public Employee(String name, int age, int pay, int yearsOf) {
		super();
		this.name = name;
		this.age = age;
		this.pay = pay;
		this.yearsOf = yearsOf;
	}
	
}

class Department{
	Employee head;
	Employee senior;
	Employee junior;
	public Department(Employee head, Employee senior, Employee junior) {
		super();
		this.head = head;
		this.senior = senior;
		this.junior = junior;
	}
}
