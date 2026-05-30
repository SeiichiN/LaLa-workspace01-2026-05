package code5_7;

import java.util.Random;

public class MapGame2 {
	public static final int YSIZE = 5;
	public static final int XSIZE = 5;
	public static final Random RND = new Random();
	
	public static void printHere(int x, int y, String[][] map) {
		// System.out.print("現在位置 [" + y + ":" + x + "] ");
		// System.out.println(map[y][x]);
		String s = switch (map[y][x]) {
		case "p" -> "ポーションがあった！";
		case "e" -> "エーテルがあった！";
		case "g" -> "ゴブリンが現れた！";
		case "s" -> "スライムが現れた！";
		default -> "何も見当たらない";
		};
		System.out.println(s);
	}

	public static int[] move(int x, int y) {
		int oldx = x;
		int oldy = y;
		while (true) {
			System.out.print("a← w↑ s↓ d→ > ");	
			String str =
					new java.util.Scanner(System.in).nextLine();
			switch (str) {
			case "w" -> { y--; }
			case "s" -> { y++; }
			case "a" -> { x--; }
			case "d" -> { x++; }
			}
			if (x >= 0 && x < YSIZE && y >= 0 && y < XSIZE) {
				break;
			} else {
				System.out.println("そちらにはいけません");
				x = oldx;
				y = oldy;
			}			
		} 
		int[] newPos = {x, y};
		return newPos;		
	}
	
	public static void printMap(int px, int py, String[][] map) {
		for (int y = 0; y < YSIZE; y++) {
			for (int x = 0; x < XSIZE; x++) {
				System.out.print("|");
				if (x == px && y == py) {
					System.out.print("A");
				} else {
					System.out.print(map[y][x]);
				}
			}
			System.out.println("|");
		}
	}
	
	public static void main(String[] args) {
		String[][] map = {
				{".", "p", ".", ".", "."},	
				{".", ".", ".", "g", "."},	
				{".", ".", ".", ".", "."},	
				{".", "s", ".", ".", "."},	
				{".", ".", "e", ".", "."},	
		};
		int y = RND.nextInt(YSIZE);
		int x = RND.nextInt(XSIZE);
		printMap(x, y, map);
		printHere(x, y, map);
		
		while (true) {
			int[] pos = move(x, y);
			x = pos[0];
			y = pos[1];
			printMap(x, y, map);
			printHere(x, y, map);
		}

	}

}
