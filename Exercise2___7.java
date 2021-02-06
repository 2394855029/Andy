package Exercise;//通过1970年1月1日午夜到现在的毫秒数获取当前的时间。

import java.util.Scanner;

public class Exercise2___7 {

	public static void main(String[] args) {
		long totalMilliseconds = System.currentTimeMillis();//1970年1月1日午夜到现在的毫秒数
		long totalSeconds = totalMilliseconds / 1000;
		
		long currentSeconds = totalSeconds % 60;
		long totalMinutes = totalSeconds / 60;
		
		long currentMinutes = totalMinutes % 60;
		long totalHours = totalMinutes / 60;
		
		long currentHours = totalHours % 24;
		System.out.println("现在的时间为 "+currentHours+":"+currentMinutes+":"+currentSeconds+" GMT");
		
	}

}
