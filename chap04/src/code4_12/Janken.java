package code4_12;

public class Janken {

	public static void main(String[] args) {
		String[] hands = {"グー", "チョキ", "パー"};
		System.out.print("0:グー 1:チョキ 2:パー > ");
		int user = new java.util.Scanner(System.in).nextInt(3);
		System.out.println("ユーザーの手は" + hands[user] + "です");
		
		int com = new java.util.Random().nextInt(3);
		System.out.println("コムの手は" + hands[com] + "です");
		
	}

}
