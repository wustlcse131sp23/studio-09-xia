package studio9;

import java.util.HashMap;
import java.util.Map;

import assignment7.Student;

public class UniversityDatabase {
	//TODO: Complete this class according to the studio instructions
	private final Map<String, Student> myMap;
	
	public UniversityDatabase() {
		this.myMap = new HashMap<>();
	}

	public void addStudent(String accountName, Student student) {
		// TODO
		myMap.put(accountName, student);
	}

	public int getStudentCount() {
		// TODO
		int count = myMap.size();
		return count;
	}

	public String lookupFullName(String accountName) {
		// TODO: Complete according to studio instructions
		if(myMap.get(accountName)==null) {
			return null;
		}
		else {
			return myMap.get(accountName).getFullName();
		}
	}

	public double getTotalBearBucks() {
		// TODO
		double total=0.0;
		for (Student s : myMap.values() ) {
			total +=s.getBearBucksBalance();
		}
		return total;
	}
}

