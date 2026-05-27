package code4_14;

public class Main {

	public static void main(String[] args) {
		
		int[] scores = {20, 30, 40, 50, 80};
		int sum = 0;
		for (int value : scores) {
			sum += value;
		}
		System.out.println(sum);
		
		String[] hands = {"グー", "チョキ", "パー"};
		for (String hand : hands) {
			System.out.println(hand);
		}

	}

}
