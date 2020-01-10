
public class insertion {

	public void insertionSort(int[] a) {
		int itemToInsert, j;
		boolean stillLooking;
		int iterations = 0;
		
		for (int k = 1; k < a.length; k++) {
			itemToInsert = a[k];
			j = k - 1;
			stillLooking = true;
			
			while ((j >= 0) && stillLooking) {
				if (itemToInsert < a[j]) {
					a[j + 1] = a[j];
					a[j] = itemToInsert;
					j--;
				} 
				else {
					stillLooking = false;
				a[j + 1] = itemToInsert;
				}
				iterations++;
			}
		}
		System.out.println("Insertion Sort:");
		for (int x = 0; x < a.length; x++) {
			if (x == a.length - 1) {
				System.out.println(a[x]);
			}
			else
				System.out.print(a[x] + ", ");
		}
		System.out.println("Iterations: " + iterations);
	}
}


