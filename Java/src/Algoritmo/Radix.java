package Algoritmo;

import java.util.Arrays;

public class Radix {

	public static void main(String[] args) {
		int[] arr = { 12, 11, 13, 5, 6 };
		radixSort(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	public static void radixSort(int[] arr) {
		int max = Arrays.stream(arr).max().getAsInt();
		for (int exp = 1; max / exp > 0; exp *= 10) {
			countingSortByDigit(arr, exp);
		}
	}

	public static void countingSortByDigit(int[] arr, int exp) {
		int n = arr.length;
		int[] output = new int[n];
		int[] count = new int[10];
		Arrays.fill(count, 0);

		for (int i = 0; i < n; i++) {
			count[(arr[i] / exp) % 10]++;
		}

		for (int i = 1; i < 10; i++) {
			count[i] += count[i - 1];
		}

		for (int i = n - 1; i >= 0; i--) {
			output[count[(arr[i] / exp) % 10] - 1] = arr[i];
			count[(arr[i] / exp) % 10]--;
		}

		System.arraycopy(output, 0, arr, 0, n);
	}
}