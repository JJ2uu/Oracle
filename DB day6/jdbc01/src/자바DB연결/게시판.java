package 자바DB연결;

import java.util.Scanner;

public class 게시판 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		BbsDAO bdao = new BbsDAO();
		
		System.out.println("원하는 작업 선택 >> (1)글쓰기 (2)게시글 삭제 (3)게시글 제목 수정 (4)게시글 내용 수정");
		int choice = sc.nextInt();
		
		if (choice == 1) {
			System.out.println("제목을 입력하세요");
			String title = sc.next();
			System.out.println("내용을 입력하세요");
			String content = sc.next();
			System.out.println("작성자 이름을 입력하세요");
			String writer = sc.next();
			
			bdao.insert(title, content, writer);
			
		} else if (choice == 2) {
			System.out.println("삭제할 게시글 제목을 입력하세요.");
			String title = sc.next();
			
			bdao.delete(title);
			
		} else if (choice == 3) {
			System.out.println("변경할 게시글 번호를 입력하세요.");
			int no = sc.nextInt();
			System.out.println("게시글 제목 변경:  ");
			String title = sc.next();
			
			bdao.update(no, title);
			
		} else {
			System.out.println("변경할 게시글 번호를 입력하세요.");
			int no = sc.nextInt();
			System.out.println("게시글 내용 변경:  ");
			String content = sc.next();
			bdao.update1(no, content);
		}
	}

}
