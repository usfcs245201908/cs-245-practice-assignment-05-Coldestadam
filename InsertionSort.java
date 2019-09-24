public class InsertionSort implements SortingAlgorithm{

	public void sort(int[] a){
		for(int i=1; i<a.length; i++){
			int unsorted = a[i];
			int index_check = i-1;

			while(index_check>=0 && a[index_check] > unsorted)
			{
				a[index_check + 1] = a[index_check];
				index_check-=1;
			}

			a[index_check+1] = unsorted;
		}
	}
}