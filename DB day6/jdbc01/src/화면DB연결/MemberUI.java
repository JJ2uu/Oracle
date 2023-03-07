package 화면DB연결;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MemberUI extends JFrame {

	public static void main(String[] args) {
		 MemberUI f = new MemberUI();
	}
	public MemberUI() {
		setTitle("회원가입");
		setSize(350, 550);
		setLayout(new FlowLayout());
		getContentPane().setBackground(new Color(242, 242, 242));
		
		Font font = new Font("NanumGothic", Font.BOLD, 30);
		Font font2 = new Font("NanumGothic", Font.BOLD, 20);
		
		JLabel title = new JLabel("회원가입화면");
		title.setHorizontalAlignment(JLabel.CENTER);
		title.setPreferredSize(new Dimension(350,80));
		JLabel id = new JLabel("아이디");
		id.setHorizontalAlignment(JLabel.LEFT);
		id.setPreferredSize(new Dimension(80,40));
		JLabel pw = new JLabel("패스워드");
		pw.setHorizontalAlignment(JLabel.LEFT);
		pw.setPreferredSize(new Dimension(80,40));
		JLabel name = new JLabel("이름");
		name.setHorizontalAlignment(JLabel.LEFT);
		name.setPreferredSize(new Dimension(80,40));
		JLabel tel = new JLabel("전화번호");
		tel.setHorizontalAlignment(JLabel.LEFT);
		tel.setPreferredSize(new Dimension(80,40));
		
		JTextField idField = new JTextField(10);
		idField.setPreferredSize(new Dimension(320, 40));
		JTextField pwField = new JTextField(10);
		pwField.setPreferredSize(new Dimension(320, 40));
		JTextField nameField = new JTextField(10);
		nameField.setPreferredSize(new Dimension(320, 40));
		JTextField telField = new JTextField(10);
		telField.setPreferredSize(new Dimension(320, 40));
		
		JButton sign = new JButton("회원가입");
		sign.setPreferredSize(new Dimension(300, 50));
		sign.setBackground(new Color(77, 77, 255));
		sign.setForeground(Color.white);
		sign.setBorderPainted(false);
		JButton drop = new JButton("회원탈퇴");
		drop.setPreferredSize(new Dimension(300, 50));
		drop.setBackground(new Color(0, 0, 102));
		drop.setForeground(Color.white);
		drop.setBorderPainted(false);
		JButton update = new JButton("회원정보 수정");
		update.setPreferredSize(new Dimension(300, 50));
		update.setBackground(new Color(77, 77, 255));
		update.setForeground(Color.white);
		update.setBorderPainted(false);
		JButton search = new JButton("회원정보 검색");
		search.setPreferredSize(new Dimension(300, 50));
		search.setBackground(new Color(77, 77, 255));
		search.setForeground(Color.white);
		search.setBorderPainted(false);
		
		add(title);
		add(id);
		add(idField);
		add(pw);
		add(pwField);
		add(name);
		add(nameField);
		add(tel);
		add(telField);
		add(sign);
		add(search);
		add(update);
		add(drop);
		
		title.setFont(font);
		id.setFont(font2);
		idField.setFont(font2);
		pw.setFont(font2);
		pwField.setFont(font2);
		name.setFont(font2);
		nameField.setFont(font2);
		tel.setFont(font2);
		telField.setFont(font2);
		sign.setFont(font2);
		drop.setFont(font2);
		update.setFont(font2);
		search.setFont(font2);
		
		setVisible(true);
	}
}
