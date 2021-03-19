package com.epam.datastructure.practice.array;

public class PrimeNumber {

	public static void main(String[] args) {
		int arr[] = new int[50];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}

		int size = (int) Math.sqrt(arr.length);
		for (int i = 1; i < size; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[j] == arr[i] || arr[i] == 0) {
					continue;
				} else if (arr[j] % arr[i] == 0) {
					arr[j] = 0;
				}

			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				continue;
			}
			System.out.print(arr[i] + "\t");
		}

	}
}
