package rensyu5_1;

public class Main {
	
	public static void introduceOneself() {
		String name = "浦島太郎";
		int age = 23;
		double height = 171.5;
		char eto = '子';
		String message = "私の名前は" + name + "です。\n";
		message += "歳は" + age + "歳です。\n";
		message += "身長は" + height + "cmです。\n";
		message += "十二支は" + eto + "です。";
		System.out.println(message);
		
		String message2 = "私の名前は" + name + "です。" +
		        "歳は" + age + "歳です。" + 
				"身長は" + height + "cmです。" + 
		        "十二支は" + eto + "です。";
		
	}

	public static void main(String[] args) {
		introduceOneself();

	}

}
