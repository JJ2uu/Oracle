package 자바DB연결;

import java.util.Scanner;

public class 게시판글쓰기 {

	public static void main(String[] args) {
		
		// 입력해보자.
		Scanner sc = new Scanner(System.in);
		System.out.println("title/content/writer 순으로 입력하세요.");

		String title = sc.next();
		String content = sc.next();
		String writer = sc.next();
		BbsDAO bdao = new BbsDAO();
		bdao.insert(title, content, writer);
	}

}
