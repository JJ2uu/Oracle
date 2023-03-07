package 자바DB연결;

import java.util.Scanner;

public class 게시글삭제하기 {

	public static void main(String[] args) {
		
		// 입력해보자.
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 NO를 입력하세요.");
		String title = sc.next();

		BbsDAO bdao = new BbsDAO();
		bdao.delete(title);
	}

}
