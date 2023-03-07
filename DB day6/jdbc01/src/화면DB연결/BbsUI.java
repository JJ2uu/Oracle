package 화면DB연결;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class BbsUI extends JFrame {

	public static void main(String[] args) {
		 BbsUI f = new BbsUI();
	}
	public BbsUI() {
		setTitle("회원가입");
		setSize(350, 500);
		setLayout(new FlowLayout());
		getContentPane().setBackground(new Color(242, 242, 242));
		
		Font font = new Font("NanumGothic", Font.BOLD, 30);
		Font font2 = new Font("NanumGothic", Font.BOLD, 20);
		
		JLabel my = new JLabel("나의 게시판");
		my.setHorizontalAlignment(JLabel.CENTER);
		my.setPreferredSize(new Dimension(350,80));
		JLabel id = new JLabel("아이디");
		id.setHorizontalAlignment(JLabel.LEFT);
		id.setPreferredSize(new Dimension(80,40));
		JLabel title = new JLabel("제목");
		title.setHorizontalAlignment(JLabel.LEFT);
		title.setPreferredSize(new Dimension(80,40));
		JLabel content = new JLabel("내용");
		content.setHorizontalAlignment(JLabel.LEFT);
		content.setPreferredSize(new Dimension(80,40));
		JLabel name = new JLabel("작성자");
		name.setHorizontalAlignment(JLabel.LEFT);
		name.setPreferredSize(new Dimension(80,40));
		
		JTextField idField = new JTextField(10);
		idField.setPreferredSize(new Dimension(320, 40));
		JTextField titleField = new JTextField(10);
		titleField.setPreferredSize(new Dimension(320, 40));
		JTextField contentField = new JTextField(10);
		contentField.setPreferredSize(new Dimension(320, 40));
		JTextField nameField = new JTextField(10);
		nameField.setPreferredSize(new Dimension(320, 40));
		
		JButton sign = new JButton("게시글 등록");
		sign.setPreferredSize(new Dimension(300, 50));
		sign.setBackground(new Color(77, 77, 255));
		sign.setForeground(Color.white);
		sign.setBorderPainted(false);
		JButton drop = new JButton("게시글 삭제");
		drop.setPreferredSize(new Dimension(300, 50));
		drop.setBackground(new Color(0, 0, 102));
		drop.setForeground(Color.white);
		drop.setBorderPainted(false);
		JButton search = new JButton("게시글 검색");
		search.setPreferredSize(new Dimension(300, 50));
		search.setBackground(new Color(77, 77, 255));
		search.setForeground(Color.white);
		search.setBorderPainted(false);
		
		add(my);
		add(id);
		add(idField);
		add(title);
		add(titleField);
		add(content);
		add(contentField);
		add(name);
		add(nameField);
		add(sign);
		add(search);
		add(drop);
		
		my.setFont(font);
		id.setFont(font2);
		idField.setFont(font2);
		title.setFont(font2);
		titleField.setFont(font2);
		name.setFont(font2);
		nameField.setFont(font2);
		content.setFont(font2);
		contentField.setFont(font2);
		sign.setFont(font2);
		drop.setFont(font2);
		search.setFont(font2);
		
		setVisible(true);
	}
}
