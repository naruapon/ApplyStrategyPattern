
public class SoftwareArchitectureSubject extends Subject {
	//Sortable sortScore = new SelectionSort();
	//Sortable sortScore = new BubbleSort();
	Sortable sortScore = new InsertionSort();
	
	public SoftwareArchitectureSubject(){
		super();

	}
	
	@Override
	public Integer[] setScore() {
		score[0] =  56;
		score[1] =  5;
		score[2] =  35;
		score[3] =  44;
		score[4] =  85;
		score[5] =  10;
		score[6] =  48;
		score[7] =  66;
		return score;
	}
	
	@Override
	protected Integer[] sortingScore(Integer[] array){
		//System.out.println(array[0]);
		//System.out.println(array[1]);
		return this.sortScore.sort(array);
	   
	}



}
