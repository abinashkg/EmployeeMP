package EMP;

public abstract class Salary {
	int salary;
	public double calculateGross(){
		double houseRent=salary/2;
		int medicalAllowence=1500;
		double grossSalary=salary+houseRent+medicalAllowence;
		return grossSalary;
	}
	public abstract double calculateBonus();
}
