package rensyu3_1;

public class Main {

	public static void main(String[] args) {
		int weight = 60;
		System.out.println(weight == 60);
		
		int age1 = 30;
		int age2 = 31;
		System.out.println((age1 + age2) * 2 > 60);
		
		int age = 3;
		System.out.println(age % 2 == 1);
		
		System.out.print("> ");
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.println(name.equals("湊"));

	}

}
