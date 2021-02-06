package Exercise;//求坐标任意三角形和坐标任意一点的关系

import java.util.Scanner;

public class Exercise3_19Expand {

	public static void main(String[] args) {
		double x,y,x1,x2,x3,y1,y2,y3,a,b,c;
		double triangleAreaABC,triangleAreaABP,triangleAreaBCP,triangleAreaACP;
		double triangleAreaCopy;
		Scanner input = new Scanner(System.in);
		System.out.print("please enter P coordinates:");
		x = input.nextDouble();
		y = input.nextDouble();
		System.out.print("please enter the coordinates of triangle A:");
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		System.out.print("please enter the coordinates of triangle B:");
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		System.out.print("please enter the coordinates of triangle C:");
		x3 = input.nextDouble();
		y3 = input.nextDouble();
		
		 a = (x3 - x2)*(x3 - x2) + (y3 - y2)*(y3 - y2);
		 a = Math.sqrt(a);
		 b = (x3 - x1)*(x3 - x1) + (y3 - y1)*(y3 - y1);
		 b = Math.sqrt(b);
		 c = (x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1);
		 c = Math.sqrt(c);
		 
		 boolean conditionA = (x2 - x1)*(y3 - y2) != (y2 - y1)*(x3 - x2);
		 boolean conditionB = a + b > c && b + c > a && a + c > b;
				 
		if(conditionA && conditionB)
		{
			System.out.println("A,B,C do form a triangle");
		}
		else 
		{
			System.out.println("A,B,C do not form a triangle");
			System.exit(0);
		}
		
		triangleAreaCopy = (x1*y2-x1*y3+x2*y3-x2*y1+x3*y1-x2*y2)*0.5;
		if(triangleAreaCopy < 0)
		{
			triangleAreaABC = (0 - triangleAreaCopy);
		}
		else
		{
			triangleAreaABC = triangleAreaCopy;
		}//求出三角形ABC的面积
		
		
		triangleAreaCopy = (x1*y2-x1*y+x2*y-x2*y1+x*y1-x2*y2)*0.5;
		if(triangleAreaCopy < 0)
		{
			triangleAreaABP = (0 - triangleAreaCopy);
		}
		else
		{
			triangleAreaABP = triangleAreaCopy;
		}//计算三角形ABP的面积
		
		triangleAreaCopy = (x3*y2-x3*y+x2*y-x2*y3+x*y3-x2*y2)*0.5;
		if(triangleAreaCopy < 0)
		{
			triangleAreaBCP = (0 - triangleAreaCopy);
		}
		else
		{
			triangleAreaBCP = triangleAreaCopy;
		}//计算三角形BCP的面积
		
		triangleAreaCopy = (x3*y1-x3*y+x1*y-x1*y3+x*y3-x1*y1)*0.5;
		if(triangleAreaCopy < 0)
		{
			triangleAreaACP = (0 - triangleAreaCopy);
		}
		else
		{
			triangleAreaACP = triangleAreaCopy;
		}//计算三角形ACP的面积
		
		boolean condition1 = (triangleAreaABC == triangleAreaABP + triangleAreaACP + triangleAreaBCP);
		boolean condition2 = (triangleAreaABC < triangleAreaABP + triangleAreaACP + triangleAreaBCP);
		boolean condition3 = (triangleAreaABC > triangleAreaABP + triangleAreaACP + triangleAreaBCP);
		
		if(condition1)
			{
			System.out.println("P point is in the triangle ABC");
			}
		else if(condition2)
			{
			System.out.println("P point is outside of triangle ABC");
			}
		else if(condition3)
			{
			System.out.println("The situation does not exist");
			}
	}
}
