package practise;

import java.util.ArrayList;
import java.util.List;

public class pascal_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static List<List<Integer>> generate(int numRows) {
        int[][] matrix = new int[numRows+1][numRows+1];
        List<Integer> InnerList = new ArrayList<>();
        List<List<Integer>> list= new ArrayList<>();
        int cols =1;
        // matrix[0][0] = 1;
        // InnerList.add(matrix[0][0]);
        // list.add(InnerList); 
        // InnerList = new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            matrix[i][0] = 1;
            InnerList.add(matrix[i][0]);
            for(int j=1;j<cols;j++){
                matrix[i][j] = matrix[i-1][j-1]+matrix[i-1][j];
                InnerList.add(matrix[i][j]);
            }
            cols++;
            list.add(InnerList);
            InnerList = new ArrayList<>();
        }
        // System.out.println(list);
        return list;
    }

}
