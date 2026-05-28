package code4_19;

public class Main {

	public static void main(String[] args) {
		int[][] scores = {
				{40, 50, 60},
				{80, 60, 70}
		};
		System.out.println(scores.length);
		System.out.println(scores[0].length);
		
		for (int[] y : scores) {
			for (int x : y) {
				System.out.println(x);
			}
		}
			
	}

}
