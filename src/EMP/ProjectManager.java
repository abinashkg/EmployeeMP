package EMP;

import java.util.ArrayList;
import java.util.List;

public class ProjectManager extends Employee {
 
	List<Employee> ProjectMemberList= new ArrayList<>();
	
	public ProjectManager(String name, String designation, int salary, int age, String work, Gender gender) {
		super(name, designation, salary, age, work, gender);
		
	}
	
	
	public ProjectManager(String name, String designation, int salary, int age, String work, Gender gender,
			List<Employee> projectMemberList) {
		super(name, designation, salary, age, work, gender);
		ProjectMemberList = projectMemberList;
	}


	public List<Employee> getProjectMemberList() {
		return ProjectMemberList;
	}
	
	public ProjectManager setProjectMemberList(List<Employee> projectMemberList) {
		ProjectMemberList = projectMemberList;
		return this;
	}
	
	public String namesOfProjectMembers(){
		
		String namesList = ProjectMemberList.stream()
				.filter( employee -> employee.getAge() > 20 )
				.map( employee -> employee.getName() )
				.reduce( (employee1 , employee2 ) -> employee1 + "," + employee2 ).get();
		return namesList;
		
	}
	
	public void workDetailsOfMemebers(){
		
		ProjectMemberList.stream()
				.forEach( employee -> System.out.println(employee.getName() + " : " + employee.getWork() ));
	}
	
}
