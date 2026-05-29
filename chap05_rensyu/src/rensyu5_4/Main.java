package rensyu5_4;

public class Main {

	public static double calcTriangleArea(
		                  double bottom, double height) {
		double area = bottom * height / 2.0;
		return area;
	}
	
	public static double calcCircleArea(double radius) {
		double area = radius * radius * 3.14;
		return area;
	}
	
	public static void main(String[] args) {
		double bottom = 10.0;
		double height = 5.0;
		double area = calcTriangleArea(bottom, height);
		System.out.println("面積は" + area + "平方cm");
		
		double radius = 5.0;
		double area2 = calcCircleArea(radius);
		System.out.println("面積は" + area2 + "平方cm");
		
	}

}
