
public class quick {
	public int iterations = 0;
	void quickSort (int[] a, int left, int right) {
		if (left >= right) return;
		int i = left;
		int j = right;
		int pivotValue = a[(left + right) / 2];
		while (i < j) {
			while (a[i] < pivotValue) {
				i++;
			}
			while (a[j] > pivotValue) {
				j--;
			}
			if (i <= j) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
			}
		}
		iterations++;
		quickSort (a, left, j);
		quickSort (a, i, right);
	}
	
	public void print(int[] a) {
		System.out.println("Quick Sort:");
		for (int x = 0; x < a.length; x++) {
			if (x == a.length - 1) {
				System.out.println(a[x]);
				break;
			}
			else
				System.out.print(a[x] + ", ");
	}
		System.out.println("Iterations: " + iterations);

}
}
