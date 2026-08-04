import java.util.List;
import java.util.ArrayList;
public class Main {
	public static void linearSearch(int [][] mat,int target){
		List<Integer> ans=new ArrayList<>();
		for(int row=0;row<mat.length;row++){
			for(int col=0;col<mat[0].length;col++){
				if(mat[row][col]==target){
					ans.add(row);
					ans.add(col);
					}
				}	
			}
		System.out.println(ans);
		return;		
		}
	public static void main(String[] args) {
		int[][]matrix={{1,2,3},{4,5,6},{7,8,9}};
		int target=7;
		linearSearch(matrix,target);
	}
}