package Exercise;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class BigJob {
	
	public static int maxX;
	public static int maxY;

	public static ArrayList totalPathList = new ArrayList();//记录所有的可走路线

	public static void main(String[] args) throws FileNotFoundException{
		int[][] arr3 = ReadMatrix.main();
		
		maxX = arr3.length - 1;
		maxY = arr3[0].length - 1;

		ArrayList<Point> pathList = new ArrayList<Point>();
		totalPathList.add(pathList);
		long startTime = System.currentTimeMillis();
		getShortestPath(arr3, pathList, 0, 0);
		
		int shortestCount = 0;//记最短的路径长度

		if(totalPathList.size() > 0)
		{
			ArrayList<Point> firstPathList = (ArrayList<Point>)totalPathList.get(0);
			shortestCount = firstPathList.size();
		}

		for(int i = 0; i < totalPathList.size(); i++)
		{
			ArrayList<Point> onePathList = (ArrayList<Point>)totalPathList.get(i);
			if (shortestCount > onePathList.size())
				shortestCount = onePathList.size();
		}
		
		int a = 1;
		for(int i = 0; i < totalPathList.size(); i++)
		{
			ArrayList<Point> onePathList = (ArrayList<Point>)totalPathList.get(i);
			if(onePathList.size() == shortestCount)
			{
				System.out.print("Shortest path"+ a +":");
				a++;
				for(int j = 0; j < onePathList.size();j++)
				{
					System.out.print("("+onePathList.get(j).x+","+onePathList.get(j).y+") ");
					if(j % 5 == 0)
					{
						System.out.println();
					}
				}
				System.out.println("\n");
			}
		}
		System.out.println("The shortest distance is "+ shortestCount);
		long endTime = System.currentTimeMillis();
		long time = endTime - startTime;
		System.out.println("The runnning time of the program is "+ time);

	}

	public static boolean IsAGoodPoint(int[][] ArranyList, ArrayList<Point> pathList, int x, int y)
	{
		//走出界的情况
		if((x < 0) || (x > maxX))
		{
			return false;
		}
		if((y < 0)||(y > maxY))
		{
			return false;
		}

		for(int i = 0; i < pathList.size(); i++)
		{
			if((pathList.get(i).x == x)&&(pathList.get(i).y == y))
			{
				return false;
			}
		}

		if(ArranyList[x][y] != 0)
			return false;
		
		return true;
	}


	public static void getShortestPath(int[][] ArranyList, ArrayList<Point> pathList, int x, int y)
	{
		Point curPoint = new Point(x, y);
		pathList.add(curPoint);

		if((x == maxX)&&(y == maxY))
		{
			return;
		}

		if(IsAGoodPoint(ArranyList, pathList, x-1, y))//向上
		{
			ArrayList<Point> newPathList = (ArrayList<Point>)pathList.clone();
			totalPathList.add(newPathList);
			getShortestPath(ArranyList, newPathList, x-1, y);
		}

		if(IsAGoodPoint(ArranyList, pathList, x, y-1))//向左
		{
			ArrayList<Point> newPathList = (ArrayList<Point>)pathList.clone();
			totalPathList.add(newPathList);
			getShortestPath(ArranyList, newPathList, x, y-1);
		}

		if(IsAGoodPoint(ArranyList, pathList, x+1, y))//向下
		{
			ArrayList<Point> newPathList = (ArrayList<Point>)pathList.clone();
			totalPathList.add(newPathList);
			getShortestPath(ArranyList, newPathList, x+1, y);
		}

		if(IsAGoodPoint(ArranyList, pathList, x, y+1))//向右
		{
			ArrayList<Point> newPathList = (ArrayList<Point>)pathList.clone();
			totalPathList.add(newPathList);
			getShortestPath(ArranyList, newPathList, x, y+1);
		}
		
		totalPathList.remove(pathList);
	}
}