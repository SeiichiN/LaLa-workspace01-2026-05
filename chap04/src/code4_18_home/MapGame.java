package code4_18_home;

public class MapGame {

	public static void main(String[] args) {
		String[][] map = {
				{".", ".", ".", "p", "."},
				{".", ".", "g", ".", "."},
				{".", ".", ".", ".", "e"},
				{".", "s", ".", ".", "."},
				{".", ".", ".", ".", "."},
		};
		int y = 1;
		int x = 2;
		System.out.print("現在位置 [" + y + ":" + x + "] ");
		System.out.println(map[y][x]);
		String ch = new java.util.Scanner(System.in).nextLine();
		switch (ch) {
		case "w" -> { y--; }
		case "a" -> { x--; }
		case "s" -> { y++; }
		case "d" -> { x++; }
		}
		System.out.print("現在位置 [" + y + ":" + x + "] ");
		System.out.println(map[y][x]);
	}

}
