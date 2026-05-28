package code5_7;

public class MapGame2 {
	
	public static void printHere(int x, int y, String[][] map) {
		System.out.print("現在位置 [" + y + ":" + x + "] ");
		System.out.println(map[y][x]);
	}

	public static int[] move(int x, int y) {
		System.out.print("a← w↑ s↓ d→ > ");	
		String str =
				new java.util.Scanner(System.in).nextLine();
		switch (str) {
		case "w" -> { y--; }
		case "s" -> { y++; }
		case "a" -> { x--; }
		case "d" -> { x++; }
		}
		return new int[] {x, y};		
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
		
		int[] pos = move(x, y);
		x = pos[0];
		y = pos[1];
		
		printHere(x, y, map);

	}

}
