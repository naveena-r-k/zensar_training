package Saturday1.Task3;


import java.util.ArrayList;
import java.util.Iterator;

public class TestPatient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patient p = new Patient(201, "Johanna", "Malaria");
		Patient p1 = new Patient(401,"Anasthia","Cancer");
		Patient p2 = new Patient(890, "Sam", "COVID");
		
		ArrayList<Patient> patient= new ArrayList<Patient>();
		
		patient.add(p);
		patient.add(p1);
		patient.add(p2);
		
		Iterator<Patient> iter = patient.iterator();
		while (iter.hasNext()) {
			Patient patient2 = iter.next();
			System.out.println(patient2);
		}
	}

}
