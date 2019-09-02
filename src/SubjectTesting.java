
public class SubjectTesting {

	public static void main(String[] args) {
		Subject subject1 = new SoftwareArchitectureSubject();
		Integer[] myarray = new Integer[8];
		myarray = subject1.getScore();
		subject1.displayScore(myarray);
		
		myarray = subject1.setScore();
		subject1.setSubjectName("Software Architecture");						
		subject1.displayScore(myarray);
				
		myarray = subject1.sortingScore(myarray);
		
		subject1.displayScore(myarray);

	}

}
