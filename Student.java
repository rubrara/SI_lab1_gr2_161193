import java.util.*;

class Faculty extends Student {
	String imeFax;
	List<Student> studenti = new List<Student>();

	public Faculty(String imeFax, List<Student> studenti) {
		this.imeFax = imeFax;
	}

	public void setStudenti(List<Student> studenti) {
		this.studenti = studenti;
	}

	public double prosekKrediti
	{

	}
};



class Student {
	String index;
	String firstName;
	String lastName;

	List<Integer> grades = new List<Integer>();

	public Student(String index, String firstName, String lastName, List<Integer> grades) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.index = index;
		this.grades = grades;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public void setGrades(List<Integer> grades) {
		this.grades = grades;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getIndex() {
		return index;
	}

	public List<Integer> getGrades() {
		return grades;
	}

	public double getAverage() {
		int counter = 0;
		double sum = 0;
		for (int i = 0; i < grades.size(); i++) {
			sum += grades.get(i);
			counter++;
			i++;
		}

		return sum / counter;

	}

	public int ECTSCredits() {

		int brojNaPolozeni = grades.size();

		return brojNaPolozeni * 6;

	}

	public static void main(String[] args) {

	}
}
