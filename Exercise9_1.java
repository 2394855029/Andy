package Exercise;

public class Exercise9_1 {

	public static void main(String[] args) {
		Rectangle one = new Rectangle(4,40);
		Rectangle two = new Rectangle(3.5,35.9);
		
		System.out.println("The first Rectangle's width is "+one.width+", and the height is "+ one.height+""
				+ " and the Area is "+one.getArea()+", and the perimeter is "+one.getPerimeter());
		
		System.out.println("The Second Rectangle's width is "+two.width+", and the height is "+ two.height+""
				+ " and the Area is "+two.getArea()+", and the perimeter is "+two.getPerimeter());

	}

}

class Rectangle{
	double width = 1;
	double height = 1;
	
	public Rectangle()
	{
		
	}
	
	public Rectangle(double newWidth, double newHeight)
	{
		width = newWidth;
		height = newHeight;
	}
	
	public double getArea()
	{
		return (width * height);
	}
	
	public double getPerimeter()
	{
		return (2*width + 2*height);
	}
}
