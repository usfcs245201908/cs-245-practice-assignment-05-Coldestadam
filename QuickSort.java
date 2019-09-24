public class QuickSort implements SortingAlgorithm{

	public void sort(int[] a){
		qs(a, 0, a.length-1);
	}

	public void swap(int[] a, int i, int j){
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public int partition(int[] a, int left, int right){
		int pivot = a[right];

		int i = left-1;

		for(int j=left; j<right; j++)
		{
			if(a[j] < pivot)
			{
				i++;
				swap(a, i, j);
			}
		}
		swap(a, i+1, right);
		return (i+1);
	}

	public void qs(int[] a, int left, int right){
		if(left<right){
			int p = partition(a, left, right);
			qs(a, left, p-1);
			qs(a, p+1, right);
		}
	}

	public static void main(String[] args) {

		QuickSort h = new QuickSort();
		int[] a = new int[]{23, 4, 6, 90, 84};
		h.sort(a);
		for(int i=0; i<a.length; i++)
			System.out.print(a[i] + ", ");
	}
}