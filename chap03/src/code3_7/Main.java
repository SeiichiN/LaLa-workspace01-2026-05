package code3_7;

public class Main {

	public static void main(String[] args) {
		int i = 0;
		for (; i < 10; i++) {
			if (i == 3) { continue; }
			System.out.println("こんにちは" + i);
		}
		System.out.println(i);
	}

}
