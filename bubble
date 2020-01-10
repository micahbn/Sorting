import java.util.Random;
import java.util.Scanner;
public class bubble {
	/*
	 *    Generate a random list of either 10, 100, or 1000 numbers (user choice) and print it out
	 *    2.Sort the list using a bubble sort, print the sorted list and print the number of swaps made using a nice output
	 *    3.Sort the list using an insertion sort, print the sorted list and print the number of insertions made 
	 *    using a nice output
	 */

	void swap(int[] a, int x, int y) {
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}
	
	Random rand = new Random();
	Scanner reader = new Scanner(System.in);
	public int swaps = 0;
	
	public int[] choose() {
		System.out.println("Do you want your list to be 10, 100, or 1000 numbers?");
		int opt = reader.nextInt();
		int a[] = new int[opt];
		int b = 0;
		for (b = 0; b < opt ; b++) {
			a[b] = rand.nextInt(opt);
		}
		return a;
	}
	void bubbleSort(int[] a) {
		
		int k = 0;
		boolean exchangeMade= true;
		while ((k < a.length - 1) && exchangeMade) {
			exchangeMade = false;
			k++;
			for (int j = 0; j < a.length - k; j++) {
				if (a[j] > a[j + 1]) {
					swap(a, j, j + 1);
					exchangeMade = true;
					swaps++;
				}
			}
		}
		int q = 0;
		System.out.println("Bubble Sort:");
		for (q = 0; q < a.length; q++) {
			if (q == a.length - 1) {
				System.out.println(a[q]);
			}
			else
			System.out.print(a[q] + ", ");
		}
		System.out.println("Iterations: " + swaps);
	}
	
	public void printOrig(int [] a) {
		System.out.println("Original Array");
		for (int z = 0; z < a.length; z++) {
			if (z == a.length - 1) {
				System.out.println(a[z]);
			}
			else {
				System.out.print(a[z] + ", ");
			}
		}
	}
}
