package practise;

public class MazePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mazePath(0,0,2,2,"");
	}
	public static void mazePath(int currRow, int currCol, int row,int col, String ans) {
		if(currRow==row-1 && currCol==col-1) {
			System.out.println(ans);
			return;
		}
		if(currRow>row || currCol>col) {
			return;
		}
		mazePath(currRow,currCol+1,row,col,ans+"H");
		mazePath(currRow+1,currCol,row,col,ans+"V");
	}
}
