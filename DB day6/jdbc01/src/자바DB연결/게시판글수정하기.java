package 자바DB연결;

import java.util.Scanner;

public class 게시판글수정하기 {

	public static void main(String[] args) {
		
		// 입력해보자.
		Scanner sc = new Scanner(System.in);
		System.out.println("TITLE을 입력하세요.");
		int no = sc.nextInt();
		String title = sc.next();

		BbsDAO bdao = new BbsDAO();
		bdao.update(no, title);
	}

}
