package Algoritmo;

public class Selection {

	public static void main(String[] args) {
		int[] arr = { 12, 11, 13, 5, 6 };
		selectionSort(arr);
		System.out.println("Array ordenado:");
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	public static void selectionSort(int[] arr) {
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			int minIndex = i;

			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}

			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	}
}