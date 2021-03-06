
public class selection {
	public int iterations = 0;
	
	void selectionSort(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			int minIndex = findMinimum(a, i);
			if (minIndex != i)
				swap(a, i, minIndex);
			iterations++;
		}
		System.out.println("Selection Sort:");
		for (int x = 0; x < a.length; x++) {
			if (x == a.length - 1)
				System.out.println(a[x]);
			else
				System.out.print(a[x] + ", ");
		}
		System.out.println("Iterations: " + iterations);
	}
	
	int findMinimum(int[] a, int first) {
		int minIndex = first;
		for (int i = first + 1; i < a.length; i++) {
			if (a[i] < a[minIndex]){
				minIndex = i;
			}
		}
		return minIndex;
	}
	
	void swap(int[] a, int x, int y) {
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;
		
	}

}
