package rensyu5_2;

public class Main {
	
	public static void email(String address, String text) {
		String message =
				address + "に、以下のメールを送信しました。\n" + 
			    "件名: 無題\n" +
				"本文: " + text;
		System.out.println(message);
	}
	
	public static void email(
			String title, String address, String text) {
		String message = 
				address + "に、以下のメールを送信しました。\n" +
				"件名:" + title + "\n" +
				"本文:" + text;
		System.out.println(message);
	}

	public static void main(String[] args) {
		String title = "こんにちは";
		String address = "taro@urashima.jp";
		String text = "竜宮城へいきたいな";
		email(address, text);
		// email(title, address, text);

	}

}
