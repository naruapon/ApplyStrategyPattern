
public abstract class Subject {
	protected String subjectName;
	protected Integer[] score = new Integer[8];
	protected Sortable sortScore;
	
	public Subject(){
		subjectName = "";
		score[0] =  0;
		score[1] =  0;
		score[2] =  0;
		score[3] =  0;
		score[4] =  0;
		score[5] =  0;
		score[6] =  0;
		score[7] =  0;
	}
	
	public Integer[] getScore(){
		return score;
	}
	

	

	
	public void setSubjectName(String sname){
		subjectName = sname;
	}
	
	public abstract Integer[] setScore();
	
	public void displayScore(Integer[] arr){
		System.out.println(subjectName+" Score :");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}

	protected abstract Integer[] sortingScore(Integer[] myarray);


}
