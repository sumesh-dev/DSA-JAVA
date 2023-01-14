package practise;

import java.util.List;
import java.util.Scanner;

public class Transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int[][] matrix = new int[row][col];
		List<List<Integer>> list;
		for(int i =0;i<row;i++) {
			for(int j=0;j<col;j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		transpose(matrix);
		for(int i =0;i<row;i++) 
			for(int j=0;j<col;j++) 
				System.out.print(matrix[i][j]);
	}
	
	public static void transpose(int[][] matrix) {
		int row = matrix.length;
		int col = matrix[0].length;
		for(int i=0;i<row;i++) {
			for(int j=i;j<col;j++) {
				int temp =0;
				temp = matrix[i][j];
				matrix[i][j]= matrix[j][i];
				matrix[j][i] = temp;
			}
		}
//		for(int i =0;i<row;i++) 
//			for(int j=0;j<col;j++) 
//				System.out.print(matrix[i][j]);
		
		for(int i=0;i<row;i++) {
			for(int j=col-1,firstp=0;j>col/2||firstp<col/2;j--,firstp++) {
				int temp =0;
				temp = matrix[i][j];
				matrix[i][j]= matrix[i][firstp];
				matrix[i][firstp] = temp;
			}
		}
	}
	
//	public static void swap(int elem1, int elem2) {
//		int temp
//	}
}
