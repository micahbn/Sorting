
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bubble b = new bubble();
		insertion i = new insertion();
		quick q = new quick();
		selection s = new selection();
		merge m = new merge();
		int[] a; 
		a = b.choose();
		int[] c = new int[a.length];
		
		//bubble sort
		for (int x = 0; x < a.length; x++) {
			c[x] = a[x];
		}
		b.printOrig(a);
		b.bubbleSort(c);
		
		//insertion sort
		for (int x = 0; x < a.length; x++) {
			c[x] = a[x];
		}

		i.insertionSort(c);
		
		//quick sort
		for (int x = 0; x < a.length; x++) {
			c[x] = a[x];
		}

		q.quickSort(c, 0, c.length - 1);
		q.print(c);
		
		//selection sort
		for (int x = 0; x < a.length; x++) {
			c[x] = a[x];
		}

		s.selectionSort(c);
		
		//merge sort
		for (int x = 0; x < a.length; x++) {
			c[x] = a[x];
		}

		int itMerge = m.mergeSort(c, 0, c.length - 1);
		System.out.println("Merge Sort");
		for (int x = 0; x < c.length; x++) {
			if (x == c.length - 1) {
				System.out.println(c[x]);
			}
			else
				System.out.print(c[x] + ", ");
				
	
		}
		System.out.println("Iterations: " + itMerge);
	}
}
