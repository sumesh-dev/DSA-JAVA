package Lec14;

import java.util.*;

public class Rotate_Image {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int[][] arr = new int[m][m];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		Rotate(arr);
	}

	public static void Rotate(int[][] arr) {
		int a = arr.length - 1;
		while (a >= 0) {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i][a] + " ");
			}
			System.out.println();
			a--;
		}

	}

}
