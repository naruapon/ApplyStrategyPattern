
public class InsertionSort implements Sortable {

	@Override
	public Integer[] sort(Integer[] arr) {
		int n = arr.length;  
        for (int j = 1; j < n; j++) {  
        	int key = arr[j];  
        	int i = j-1;  
            while ( (i > -1) && ( arr [i] > key ) ) {  
                arr [i+1] = arr [i];  
                i--;  
            }  
            arr[i+1] = key;  
        } 
        return arr;
	}

}
