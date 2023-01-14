package Lec15;
import java.util.*;
public class Matrix_Search_Leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int [][]arr=new int[m][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		int target = sc.nextInt();
		System.out.println(searchMatrix(arr,target));
	}
public static boolean searchMatrix(int[][] arr, int target) {
        int row=0;
        int col = arr[0].length-1;
        while(row<arr.length && col>=0) {
        	if(arr[row][col]==target) {
        		return true;
        	}else if (arr[row][col]>target) {
        		col--;
        	}else {
        		row++;
        	}
        }
        return false;
    }
}