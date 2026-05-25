package main;

public class Main {

	public static void main(String[] args) {
		System.out.println("0:グー 1:チョキ 2:パー > ");
		int userHand = new java.util.Scanner(System.in).nextInt();
		System.out.println("ユーザーの手は" + userHand + "です");
		int comHand = new java.util.Random().nextInt(3);
		System.out.println("わたしの手は" + comHand + "です");
		
		if (userHand == comHand) {
			System.out.println("あいこです");
		} else if ((userHand == 0 && comHand == 1) ||
				    (userHand == 1 && comHand == 2) ||
				    (userHand == 2 && comHand == 0)) {
			// if ((userHand + 1) % 3 == comHand) {}
			System.out.println("ユーザーの勝ちです");
		} else {
			System.out.println("わたしの勝ちです");
		}

	}

}
