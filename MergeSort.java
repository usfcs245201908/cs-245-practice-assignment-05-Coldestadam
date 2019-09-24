import java.util.Arrays;
public class MergeSort implements SortingAlgorithm{

	public void sort(int[] a){
		if(a.length>1){
			int split=a.length/2;

			int[] left=Arrays.copyOfRange(a, 0, split);
			int[] right=Arrays.copyOfRange(a, split, a.length);

			sort(left);
			sort(right);
			merge(left, right, a);
		}
	}

	public void merge(int[] left, int[] right, int[] target){
		int i=0;
		int j=0;
		int k=0;

		while(i<left.length && j<right.length){
			if(left[i]<=right[j])
				target[k++]=left[i++];
			else
				target[k++]=right[j++];
		}

		while(i<left.length)
			target[k++]=left[i++];

		while(j<right.length)
			target[k++]=right[j++];
	}

	public static void main(String[] args) {

		MergeSort h = new MergeSort();
		int[] a = new int[]{23, 4, 6, 90, 84};
		h.sort(a);
		for(int i=0; i<a.length; i++)
			System.out.print(a[i] + ", ");
	}

}