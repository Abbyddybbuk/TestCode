import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeSort {

	public static void main(String[] args) {
		List<EmployeeData> empList = new ArrayList<>();
		EmployeeData emp = new EmployeeData();

		EmployeeData emp1 = new EmployeeData();
		emp1.setEmpId("2");
		emp1.setEmpName("Abhijeet");
		emp1.setEmpSurname("Kulshreshtha");
		emp1.setDeptName("CSC");
		emp1.setCompName("SAP Labs India");
		empList.add(emp1);

		EmployeeData emp2 = new EmployeeData();
		emp2.setEmpId("1");
		emp2.setEmpName("Johny");
		emp2.setEmpSurname("Depp");
		emp2.setDeptName("IOT");
		emp2.setCompName("SAP Labs India");
		empList.add(emp2);

		EmployeeData emp3 = new EmployeeData();
		emp3.setEmpId("6");
		emp3.setEmpName("Will");
		emp3.setEmpSurname("Smith");
		emp3.setDeptName("TM");
		emp3.setCompName("SAP Labs India");
		empList.add(emp3);

		EmployeeData emp4 = new EmployeeData();
		emp4.setEmpId("2");
		emp4.setEmpName("Abhilash");
		emp4.setEmpSurname("Garg");
		emp4.setDeptName("CSC");
		emp4.setCompName("SAP Labs India");
		empList.add(emp4);

		// Java 7 method
		EmployeeSort.sortByJava7(empList);
		System.out.println("Compare Only by Employee Id Using Java 7");
		for (EmployeeData empData : empList) {
			System.out.println(empData.getEmpId() + " " + empData.getEmpName() + " " + empData.getEmpSurname() + " "
					+ empData.getDeptName() + " " + empData.getCompName());

		}

		System.out.println(" ");

		EmployeeSort.sortByJava8(empList);
		System.out.println("Compare Only by Employee Name Using Java 8");
		for (EmployeeData empData : empList) {
			System.out.println(empData.getEmpId() + " " + empData.getEmpName() + " " + empData.getEmpSurname() + " "
					+ empData.getDeptName() + " " + empData.getCompName());

		}
        
		System.out.println(" ");		
		empList.sort(Comparator.comparing(EmployeeData::getEmpId)
				.thenComparing(Comparator.comparing(EmployeeData::getEmpName)));
        
		System.out.println("Compare by Employee Id and Name Using Java 8");
		for (EmployeeData empData : empList) {
			System.out.println(empData.getEmpId() + " " + empData.getEmpName() + " " + empData.getEmpSurname() + " "
					+ empData.getDeptName() + " " + empData.getCompName());

		}

	}

	private static void sortByJava7(List<EmployeeData> empList) {
		Collections.sort(empList, new Comparator<EmployeeData>() {
			@Override
			public int compare(EmployeeData emp1, EmployeeData emp2) {
				return emp1.getEmpId().compareTo(emp2.getEmpId());
			}
		});
	}

	private static void sortByJava8(List<EmployeeData> empList) {
		Collections.sort(empList, (emp1, emp2) -> emp1.getEmpId().compareTo(emp2.getEmpId()));
	}

}
