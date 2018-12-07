import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeSort {

	public static void main(String[] args) {
		List<EmployeeData> empList = new ArrayList<>();
		
		EmployeeData emp1 = new EmployeeData();
		emp1.setEmpId("1096841");
		emp1.setEmpName("Abhijeet");
		emp1.setEmpSurname("Kulshreshtha");
		emp1.setDeptName("CSC");
		emp1.setCompName("SAP Labs India");
		empList.add(emp1);
		
		EmployeeData emp2 = new EmployeeData();
		emp2.setEmpId("1067676");
		emp2.setEmpName("Johny");
		emp2.setEmpSurname("Depp");
		emp2.setDeptName("IOT");
		emp2.setCompName("SAP Labs India");
		empList.add(emp2);
		
		EmployeeData emp3 = new EmployeeData();
		emp3.setEmpId("1067781");
		emp3.setEmpName("Will");
		emp3.setEmpSurname("Smith");
		emp3.setDeptName("TM");
		emp3.setCompName("SAP Labs India");	
		empList.add(emp3);	
		
		// Java 7 method
		EmployeeSort.sortByJava7(empList);
		
		for (EmployeeData empData: empList) {
			System.out.println(empData.getEmpId() + " " + empData.getEmpName() + " " + empData.getEmpSurname()
			                   + " " + empData.getDeptName() + " " + empData.getCompName());
			
		}
		
		System.out.println(" ");
		
		EmployeeSort.sortByJava8(empList);
		
		for (EmployeeData empData: empList) {
			System.out.println(empData.getEmpId() + " " + empData.getEmpName() + " " + empData.getEmpSurname()
			                   + " " + empData.getDeptName() + " " + empData.getCompName());
			
		}		

	}
	
	private static void sortByJava7 (List<EmployeeData> empList) {
		Collections.sort(empList, new Comparator<EmployeeData>() {
			@Override
			public int compare(EmployeeData emp1, EmployeeData emp2) {
				return emp1.getEmpId().compareTo(emp2.getEmpId());
			}
		});
	}
	
	private static void sortByJava8(List<EmployeeData> empList) {
		Collections.sort(empList, (emp1, emp2) -> emp1.getEmpName().compareTo(emp2.getEmpName()));
	}

}
