import java.util.ArrayList;
import java.util.List;

public class PersonDetailsPrint {

	public static void main(String[] args) {
		List<PersonDetails> personDetList = new ArrayList<>();
		List<NameMatrix> nameList = new ArrayList<>();

		PersonDetails p1 = new PersonDetails();
		p1.setFirstName("Abhijeet");
		p1.setLastName("Kulshreshtha");
		personDetList.add(p1);

		PersonDetails p2 = new PersonDetails();
		p2.setFirstName("Mohanish");
		p2.setLastName("Yadav");
		personDetList.add(p2);

		PersonDetails p3 = new PersonDetails();
		p3.setFirstName("Prabhat");
		p3.setLastName("Kushwah");
		personDetList.add(p3);

		PersonDetails p4 = new PersonDetails();
		p4.setFirstName("Trilok");
		p4.setLastName("Sharma");
		personDetList.add(p4);

		PersonDetails p5 = new PersonDetails();
		p5.setFirstName("Rajdeep");
		p5.setLastName("Sardesai");
		personDetList.add(p5);

		PersonDetails p6 = new PersonDetails();
		p6.setFirstName("Suraj");
		p6.setLastName("Pandey");
		personDetList.add(p6);

		PersonDetails p7 = new PersonDetails();
		p7.setFirstName("Subhash");
		p7.setLastName("Saxena");
		personDetList.add(p7);

		PersonDetails p8 = new PersonDetails();
		p8.setFirstName("Jaspreet");
		p8.setLastName("Dhingra");
		personDetList.add(p8);
		
		PersonDetails p9 = new PersonDetails();
		p9.setFirstName("Jatin");
		p9.setLastName("Agnihotri");
		personDetList.add(p9);		

		for (PersonDetails person : personDetList) {
			System.out.println(person.getFirstName() + " " + person.getLastName());
		}

		System.out.println(" ");
		System.out.println(" ");

		int i = 1;
		int rowCount=1;
		int listSize= personDetList.size();
		NameMatrix n1 = new NameMatrix();
		for (PersonDetails person : personDetList) {			
			switch (i) {
			case 1:
				n1.setName1(person.getFirstName() + " " + person.getLastName());
				if (rowCount==personDetList.size()) {
					nameList.add(n1);	
				}
				break;
			case 2:
				n1.setName2(person.getFirstName() + " " + person.getLastName());
				if (rowCount==personDetList.size()) {
					nameList.add(n1);	
				}				
				break;
			case 3:
				n1.setName3(person.getFirstName() + " " + person.getLastName());
				if (rowCount==personDetList.size()) {
					nameList.add(n1);	
				}					
				break;
			case 4:
				n1.setName4(person.getFirstName() + " " + person.getLastName());
                nameList.add(n1);	
                n1 = new NameMatrix();
				i=0;
				break;
			}
			rowCount++;
			i++;
			
		}
		
		
		for (NameMatrix name: nameList) {
			System.out.println(name.getName1() + "  " + name.getName2() + "  " + name.getName3() + "  "  + name.getName4());
		}
		

	}

}
