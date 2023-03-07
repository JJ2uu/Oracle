package 자바DB연결;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Random;

public class 반환값받아오기 {

	public static void main(String[] args) {
		반환값연습 re = new 반환값연습(); // 만든 메서드들 가져오기
		
		re.add2(); // 반환값 없는 메서드
		
		int result1 = re.add(200, 100); // int
		System.out.println(result1);
		
		double result2 = re.add(88.8, 33);
		System.out.println(result2);
		
		String result3 = re.add("나는", "천재다");
		System.out.println(result3);
		
		String result4 = re.add(1, "번 천재");
		System.out.println(result4);
		
		int[] result5 = re.add();
		System.out.println(result5[0]);
		
		Date result6 = re.getDate();
		System.out.println(result6);
		System.out.println(result6.getMinutes());
		System.out.println(result6.getSeconds());
		System.out.println(result6.getDay());
		
		Random result7 = re.getRandom();
		System.out.println(result7.nextInt(42));
		
		int result8 = re.getHour();
		System.out.println(result8);
		
		int result9 = re.getRandom2();
		System.out.println(result9);
		
		ArrayList result10 = re.getList();
		System.out.println(result10);
		System.out.println(result10.get(0));
		result10.set(0, "양파");
		System.out.println(result10);
		
		HashSet result11 = re.getSet();
		System.out.println(result11);
	}

}
