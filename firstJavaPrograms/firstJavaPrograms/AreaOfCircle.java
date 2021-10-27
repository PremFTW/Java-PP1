package firstJavaPrograms;

public class AreaOfCircle {
	
	static double radius;
	static double Area;

	public static void main(String[] args) {
		radius = 34;
		
		Area = radius * radius * 3.14;
		
		System.out.println("Area of a Circle with radius " +
		radius + "is" + Area);
	}

}
