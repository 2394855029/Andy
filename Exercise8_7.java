package Exercise;

public class Exercise8_7 {

	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		double[][] points = {
				{-1,0,3},
				{-1,-1,-1},
				{4,1,1},
				{2, 0.5 ,9},
				{3.5 ,2 ,-1},
				{3, 1.5 ,3},
				{-1.5, 4, 2},
				{5.5, 4, -0.5}};
		
		double shortestdistance = distance(points[0][0], points[0][1], points[0][2], points[1][0], points[1][1], points[1][2]);
		
		for(int i = 0; i < points.length; i++)
		{
			for(int j = i + 1; j < points.length; j++)
			{
				double distance0 = distance(points[i][0], points[i][1], points[i][2], points[j][0], points[j][1], points[j][2]);
				if(distance0 < shortestdistance)
				{
					a = i;
					b = j;
					shortestdistance = distance0 ;
				}
			}	
		}
		
		System.out.println("The closest points are ("+points[a][0]+","+points[a][1]+","+points[a][2]+") and ("+points[b][0]+","+points[b][1]+","+points[b][2]+")");
		System.out.println("The shortest distance is "+shortestdistance);

	}
	
	public static double distance(double x1,double y1,double z1,double x2,double y2,double z2)
	{
		double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) + Math.pow(z2 - z1, 2));
		return distance;
	}

}
