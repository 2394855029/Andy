package Exercise;

public class Exercise9_11{

	public static void main(String[] args) {
		Circle [] circleArray = new Circle [5];
		double area;
		double sum = 0;
		
		System.out.println("Radius"+"				"+"Area");
		for(int i = 0; i < circleArray.length; i++)
		{
			circleArray[i] = new Circle(Math.random()*100);
			area = circleArray[i].getArea();
			sum += area;
			System.out.printf("%.6f",circleArray[i].getRadius());
			System.out.print("			");
			System.out.printf("%.6f",circleArray[i].getArea());
			System.out.println();
		}
		
		System.out.println("——————————————————————————————————————————————");
		System.out.println("The total area of circles is "+ sum);
		
		
		
	}

}

class Circle{
	private double radius = 1;
	private double area;
	
	public Circle()
	{
			
	}
	
	public Circle(double radius)
	{
		this.radius = radius;
	}
	
	public double getArea()
	{
		return (Math.PI * radius * radius);
	}
	
	public double getRadius()
	{
		return radius;
	}
	
}
