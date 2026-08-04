public class Main {
	private static void getMaxSum(int[][]matrix){
		int maxsum=Integer.MIN_VALUE;
		for(int row=0;row<matrix.length;row++){
			int cursum=0;
		for(int col=0;col<matrix[0].length;col++){
			 		cursum+=matrix[row][col];
				}
				maxsum=Math.max(maxsum,cursum);
			}
			System.out.println(maxsum);
			return;	
	}
	public static void main(String[] args) {
		int[][] matrix={{2,6,7},{3,5,9},{1,4,8}};
		getMaxSum(matrix);
	}
}