package EMP;

public class Employee extends Salary implements Food{
	
	private String name;
	private String designation;
	private int salary;
	private int age;
	private String work;
	private Gender gender;
	
	public Employee(String name, String designation, int salary, int age, String work, Gender gender) {
		
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.age = age;
		this.work = work;
		this.gender = gender;
	}
	
	public Employee(String name, String designation, int salary, int age, String work) {

		this(name , designation , salary , age , work , Gender.OTHERS);
	}

	public Employee(String name, String designation, int salary, int age) {

		this(name , designation , salary , age, "No Work" , Gender.OTHERS);
	}
	
	public Employee(String name, String designation, int salary) {

		this(name , designation , salary , 20, "No Work" , Gender.OTHERS);
	}
	
	public Employee(String name, String designation) {

		this(name , designation , 20000 , 20, "No Work" , Gender.OTHERS);
	}
	
	public String getName() {
		return name;
	}
	public Employee setName(String name) {
		this.name = name;
		return this;
	}
	public String getDesignation() {
		return designation;
	}
	public Employee setDesignation(String designation) {
		this.designation = designation;
		return this;
	}
	public int getSalary() {
		return salary;
	}
	public Employee setSalary(int salary) {
		this.salary = salary;
		return this;
	}
	public int getAge() {
		return age;
	}
	public Employee setAge(int age) {
		this.age = age;
		return this;
	}
	public String getWork() {
		return work;
	}
	public Employee setWork(String work) {
		this.work = work;
		return this;
	}

	public Gender getGender() {
		return gender;
	}

	public Employee setGender(Gender gender) {
		this.gender = gender;
		return this;
	}
		
	public double calculateBonus() {
		double bonus=salary*2;
		return bonus;
	}

	@Override
	public void breakfastDetails() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lunchDetails() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eveningDetails() {
		// TODO Auto-generated method stub
		
	}
	
	
}

interface Food{
	void breakfastDetails();
	void lunchDetails();
	void eveningDetails();
}
