package main;

public class Main {

	public static void main(String[] args) {
		System.out.println("0:グー・1:チョキ・2:パーのいずれかを入力してください");
		
		int yourHand = new java.util.Scanner(System.in).nextInt();
		
		System.out.println("あなたの手は" + yourHand + "です");
		
		int comHand = new java.util.Random().nextInt(3);
		System.out.println("コンピュータの手は" + comHand + "です");
		
		if(yourHand == comHand) {
			System.out.println("引き分け");
		}else if((yourHand == 0 && comHand == 1) ||
				 (yourHand == 1 && comHand == 2) || 
				 (yourHand == 2 && comHand == 0)) {
			System.out.println("あなたの勝ち");
		}else {
			System.out.println("あなたの負け");
		}
		
		

	}

}
