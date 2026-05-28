package code4_19;

public class MapGame {

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
		System.out.print("現在位置 [" + y + ":" + x + "] ");
		System.out.println(map[y][x]);
		
		System.out.print("a← w↑ s↓ d→ > ");	
		String str =
				new java.util.Scanner(System.in).nextLine();
		switch (str) {
		case "w" -> { y--; }
		case "s" -> { y++; }
		case "a" -> { x--; }
		case "d" -> { x++; }
		}

		System.out.print("現在位置 [" + y + ":" + x + "] ");
		System.out.println(map[y][x]);

	}

}
