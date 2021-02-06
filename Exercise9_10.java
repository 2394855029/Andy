package Exercise;

public class Exercise9_10 {

	public static void main(String[] args) {
		QuadraticEquation qe = new QuadraticEquation(1,2,1);
		
		System.out.println(qe.getRoot1());
		System.out.println(qe.getRoot2());
	}
}

class QuadraticEquation{
	private int a,b,c;
	
	public QuadraticEquation() {
		
	}
	
	public QuadraticEquation(int a, int b, int c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public int getDiscriminant()
	{
		return b*b-4*a*c;
	}
	
	public String getRoot1()
	{
		if(a == 0)
		{
			return handleNonQuadraticEq();
		}
		else
		{
			if(getDiscriminant() == 0)
			{
				return String.valueOf(-b / (2.0 * a));
			}
			else
			{
				return String.valueOf((-b + Math.sqrt(b * b - 4 * a * c))/ (2.0 * a));
			}
		}
	}
	
	public String getRoot2()
	{
		if(a == 0)
		{
			return handleNonQuadraticEq();
		}
		else
		{
			if(getDiscriminant() == 0)
			{
				return String.valueOf(-b / (2.0 * a));
			}
			else
			{
				return String.valueOf((-b + Math.sqrt(b * b - 4 * a * c))/ (2.0 * a));
			}
		}
	}
	
	public String handleNonQuadraticEq()
	{
		if(b == 0)
		{
			if(c == 0)
			{
				return "All real numbers.";
			}
			else
			{
				return "The equation has no roots.";
			}
		}
		else
		{
			return String.valueOf(-c / (b*1.0));
		}
	}
	
	public int getA()
	{
		return a;
	}
	
	public int getB()
	{
		return b;
	}
	
	public int getC()
	{
		return c;
	}
	
}