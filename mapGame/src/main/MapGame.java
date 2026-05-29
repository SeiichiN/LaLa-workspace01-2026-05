package main;

public class MapGame {
	
	public static void printHere(int x, int y, String[][] map) {
		System.out.print("現在位置 [" + y + ":" + x + "] ");
		System.out.println(map[y][x]);
	}
	
	public static int[] move (int y, int x) {
		System.out.print("a← w↑ s↓ d→ > ");	
		String str =
				new java.util.Scanner(System.in).nextLine();
		switch (str) {
		case "w" -> { y--; }
		case "s" -> { y++; }
		case "a" -> { x--; }
		case "d" -> { x++; }
		}
		// 配列{y, x}としてリターン
	}

	public static void main(String[] args) {
		String[][] map = {
				{".", "p", ".", ".", "."},	
				{".", ".", ".", "g", "."},	
				{".", ".", ".", ".", "."},	
				{".", "s", ".", ".", "."},	
				{".", ".", "e", ".", "."},	
		};
		int y = 3;
		int x = 1;
		printHere(x, y, map);
		
		int[] XXX = move(y, x);

		printHere(x, y, map);

	}

}
