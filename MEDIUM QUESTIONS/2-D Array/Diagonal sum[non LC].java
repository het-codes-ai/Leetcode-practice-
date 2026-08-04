public class Main {
	private static void getDiagSum(int[][]matrix){
		int n=matrix.length;		
		int sum=0;
		for(int i =0;i<n;i++){
				sum+=matrix[i][i];
				sum+=matrix[n-1-i][i];
			}
		if(n%2!=0){
			sum-=matrix[n/2][n/2];
			}
		System.out.println(sum);
		return;
		}
	public static void main(String[] args) {
		int[][]matrix1={{1,2,3},{4,5,6},{7,8,9} };
		int[][]matrix2={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		getDiagSum(matrix1);
		getDiagSum(matrix2);
	}
}