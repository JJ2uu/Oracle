package 화면DB연결;

import javax.swing.JOptionPane;

import 자바DB연결.MemberDAO2;

public class MemberUITest {

	public static void main(String[] args) {
		String id = JOptionPane.showInputDialog("아이디 입력");
		String pw = JOptionPane.showInputDialog("비밀번호 입력");
		
		MemberDAO2 dao = new MemberDAO2();
		MemberVO bag1 = new MemberVO();
		
		bag1.setId(id);
		bag1.setPw(pw);
		int result = dao.login(bag1);
		if (result == 1) {
			JOptionPane.showMessageDialog(null, "로그인 성공");
			BbsUI.open();
		} else {
			JOptionPane.showMessageDialog(null, "회원정보가 없습니다.");
			MemberUI2.open();
		}
	}

}
