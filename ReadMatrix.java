package Exercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadMatrix {//BigJob

	public static int[][] main() throws FileNotFoundException {
		File file = new File("D:/InputMatrix.txt");
		String currentLine;
		int length, row, col;
		int[][] matrix;
		String[] elements;
		
		if(!file.exists())
			System.exit(0);
		
		Scanner input = new Scanner(file);
		currentLine = input.nextLine().trim();
		length = (currentLine.length()+1)/2;
		matrix = new int[length][length];

		row = 0;
		while(currentLine != "")
		{
			elements = currentLine.split("\\s");
			for(col=0; col<elements.length; col++)
			{
				matrix[row][col] = Integer.parseInt(elements[col]);
			}
			
			if(input.hasNextLine())
			{
				currentLine = input.nextLine().trim();
				row++;
			}
			else
				break;
		}
		return matrix;

	}

}
