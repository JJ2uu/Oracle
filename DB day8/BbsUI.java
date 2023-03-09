package 화면DB연결;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import 자바DB연결.BbsDAO;

public class BbsUI extends JFrame {

	public static void open() {
		 BbsUI f = new BbsUI();
	}
	public BbsUI() {
		setTitle("회원가입");
		setSize(350, 550);
		setLayout(new FlowLayout());
		getContentPane().setBackground(new Color(242, 242, 242));
		
		Font font = new Font("NanumGothic", Font.BOLD, 30);
		Font font2 = new Font("NanumGothic", Font.BOLD, 20);
		
		JLabel my = new JLabel("나의 게시판");
		my.setHorizontalAlignment(JLabel.CENTER);
		my.setPreferredSize(new Dimension(350,80));
		JLabel num = new JLabel("번호");
		num.setHorizontalAlignment(JLabel.LEFT);
		num.setPreferredSize(new Dimension(80,40));
		JLabel title = new JLabel("제목");
		title.setHorizontalAlignment(JLabel.LEFT);
		title.setPreferredSize(new Dimension(80,40));
		JLabel content = new JLabel("내용");
		content.setHorizontalAlignment(JLabel.LEFT);
		content.setPreferredSize(new Dimension(80,40));
		JLabel name = new JLabel("작성자");
		name.setHorizontalAlignment(JLabel.LEFT);
		name.setPreferredSize(new Dimension(80,40));
		
		JTextField numField = new JTextField(10);
		numField.setPreferredSize(new Dimension(320, 40));
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
		JButton update = new JButton("게시글 수정");
		update.setPreferredSize(new Dimension(300, 50));
		update.setBackground(new Color(77, 77, 255));
		update.setForeground(Color.white);
		update.setBorderPainted(false);
		JButton search = new JButton("게시글 검색");
		search.setPreferredSize(new Dimension(300, 50));
		search.setBackground(new Color(77, 77, 255));
		search.setForeground(Color.white);
		search.setBorderPainted(false);
		
		sign.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String title = titleField.getText();
				String content = contentField.getText();
				String writer = nameField.getText();
				
				BbsDAO dao = new BbsDAO();
				BbsVO bag = new BbsVO();
				bag.setTitle(title);
				bag.setContent(content);
				bag.setWriter(writer);
				
				int result = dao.insert(bag);
				if (result == 1) {
					JOptionPane.showMessageDialog(null, "작성이 완료되었습니다.");
				} else {
					JOptionPane.showMessageDialog(null, "작성 실패");
				}
			}
		});
		
		drop.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String writer = nameField.getText();
				
				BbsDAO dao = new BbsDAO();
				int result = dao.delete(writer);
				if (result == 1) {
					JOptionPane.showMessageDialog(null, "삭제가 완료되었습니다");
				} else {
					JOptionPane.showMessageDialog(null, "작성자 이름을 확인하세요");
				}
			}
		});
		
		update.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String choice = JOptionPane.showInputDialog("(1)제목 수정  (2)내용 수정 ");
				BbsDAO dao = new BbsDAO();
				BbsVO bag = new BbsVO();
				
				if (choice.equals("1")) {
					String writer = JOptionPane.showInputDialog("게시글 작성자를 입력하세요");
					String title = JOptionPane.showInputDialog("제목 수정 : ");
					bag.setWriter(writer);
					bag.setTitle(title);
					int result = dao.update(bag);
					if (result == 1) {
						JOptionPane.showMessageDialog(null, "변경이 완료되었습니다.");
					} else {
						JOptionPane.showMessageDialog(null, "게시글이 없습니다. 작성자를 확인하세요");
					}
				} else {
					String writer = JOptionPane.showInputDialog("게시글 작성자를 입력하세요");
					String content = JOptionPane.showInputDialog("내용 수정 : ");
					bag.setWriter(writer);
					bag.setContent(content);
					int result = dao.update1(bag);
					if (result == 1) {
						JOptionPane.showMessageDialog(null, "변경이 완료되었습니다.");
					} else {
						JOptionPane.showMessageDialog(null, "게시글이 없습니다. 작성자를 확인하세요");
					}
				}
			}
		});
		
		search.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String writer = nameField.getText();
				
				BbsDAO dao = new BbsDAO();
				BbsVO bag = dao.one(writer);
				if (bag != null) {
					numField.setText(String.valueOf(bag.getNo()));
					titleField.setText(bag.getTitle());
					contentField.setText(bag.getContent());
					nameField.setText(bag.getWriter());
				} else {
					JOptionPane.showMessageDialog(null, "존재하지 않는 작성자입니다.");
				}
				
			}
		});
		
		add(my);
		add(num);
		add(numField);
		add(title);
		add(titleField);
		add(content);
		add(contentField);
		add(name);
		add(nameField);
		add(sign);
		add(search);
		add(update);
		add(drop);
		
		my.setFont(font);
		num.setFont(font2);
		numField.setFont(font2);
		title.setFont(font2);
		titleField.setFont(font2);
		name.setFont(font2);
		nameField.setFont(font2);
		content.setFont(font2);
		contentField.setFont(font2);
		sign.setFont(font2);
		drop.setFont(font2);
		update.setFont(font2);
		search.setFont(font2);
		
		setVisible(true);
	}
}
