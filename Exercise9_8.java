package Exercise;

public class Exercise9_8 {

	public static void main(String[] args) {
		Fan f1 = new Fan();
		Fan f2 = new Fan();
		
		f1.on();
		f1.setSpeed(f1.getFAST());
		f1.setRadius(10);
		f1.setColor("yellow");
		
		f2.off();
		f2.setSpeed(f2.getMEDIUM());
		f2.setRadius(5);
		f2.setColor("blue");
		
		if(f1.getState())
			System.out.println("f1 is on");
		else
			System.out.println("f1 is off");
		System.out.println("f1 Speed is "+f1.getSpeed());
		System.out.println("f1 Radius is "+f1.getRadius());
		System.out.println("f1 Color is "+f1.getColor());
		
		System.out.println();
		
		if(f2.getState())
			System.out.println("f2 is on");
		else
			System.out.println("f2 is off");
		System.out.println("f2 Speed is "+f2.getSpeed());
		System.out.println("f2 Radius is "+f2.getRadius());
		System.out.println("f2 Color is "+f2.getColor());
	}

}

class Fan{
	private final int SLOW = 1;
	private final int MEDIUM = 2;
	private final int FAST = 3;
	
	private int speed = SLOW;
	private boolean on;
	private double radius = 5;
	private String color = "blue";
	
	Fan()
	{
		
	}
	
	public boolean on()
	{
		on = true;
		return on;
	}
	
	public boolean off()
	{
		on = false;
		return on;
	}
	
	public int setSpeed(int speed) 
	{
		this.speed = speed;
		return speed;
	}
	
	public String setColor(String color)
	{
		this.color = color;
		return color;
	}
	
	public int setRadius(int radius)
	{
		this.radius = radius;
		return radius;
	}
	
	
	public String toString()
	{
		if(on == true)
			return (SLOW + " " + color + "　" + radius);
		else
			return ("fan is off "+ color + radius);
	}
	
	public int getFAST()
	{
		return FAST;
	}
	
	public int getMEDIUM()
	{
		return MEDIUM;
	}
	
	public int getSpeed()
	{
		return speed;
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public boolean getState()
	{
		return on;
	}
}