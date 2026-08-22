public class Main {
	public static void printnums(int N){
		if(N==0){
			return;
			}
		System.out.println(N);
		printnums(N-1);
		}
	public static void main(String[] args) {
		printnums(100);
	}
}