package 자바DB연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import 화면DB연결.BbsVO;

public class BbsDAO {
	
	public int delete(String writer) {
		int result = 0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설계 성공.");
			// 2. 오라클 11g에 연결해보기 (java --- oracle)
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password); // Connection객체로 가져온 값을 변수에 저장
			System.out.println("2. 오라클 연결 성공.");
			
			// 자바는 객체지향언어라 String에 넣은 문자열을 특정한 부품으로 인식하지 못함
			// 특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			// SQL부품 ↓
			// 외래키(FK)설정이 되어있으면 정상적으로 DELETE가 되지 않음
			String sql = "delete from hr.BBS where writer = ?"; // 먼저 스트링에 저장하고
			PreparedStatement ps = con.prepareStatement(sql); // SQL부품 PreparedStatment를 활용해 변수에 저장
			ps.setString(1, writer);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");
			
			result = ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if (result == 1) {
				System.out.println("삭제 성공");
				ps.close();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(result);
		return result;
	}
	
	public int update(BbsVO bag) {
		int result = 0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설계 성공.");
			// 2. 오라클 11g에 연결해보기 (java --- oracle)
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password); // Connection객체로 가져온 값을 변수에 저장
			System.out.println("2. 오라클 연결 성공.");
			
			// 자바는 객체지향언어라 String에 넣은 문자열을 특정한 부품으로 인식하지 못함
			// 특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			// SQL부품 ↓
			String sql = "update hr.BBS set title = ? where writer = ? " ; // 먼저 스트링에 저장하고
			PreparedStatement ps = con.prepareStatement(sql); // SQL부품 PreparedStatment를 활용해 변수에 저장
			ps.setString(1, bag.getTitle());
			ps.setString(2, bag.getWriter());
			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");
			
			result = ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			
			if (result == 1) {
				System.out.println("변경 성공");
				ps.close();
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	public int update1(BbsVO bag) {
		int result = 0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설계 성공.");
			// 2. 오라클 11g에 연결해보기 (java --- oracle)
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password); // Connection객체로 가져온 값을 변수에 저장
			System.out.println("2. 오라클 연결 성공.");
			
			// 자바는 객체지향언어라 String에 넣은 문자열을 특정한 부품으로 인식하지 못함
			// 특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			// SQL부품 ↓
			String sql = "update hr.BBS set content = ? where writer = ? " ; // 먼저 스트링에 저장하고
			PreparedStatement ps = con.prepareStatement(sql); // SQL부품 PreparedStatment를 활용해 변수에 저장
			ps.setString(1, bag.getContent());
			ps.setString(2, bag.getWriter());
			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");
			
			result = ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if (result == 1) {
				System.out.println("변경 성공");
				ps.close();
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	
	public int insert(BbsVO bag) {
		int result = 0;
		try {
			// 1. 오라클 11g와 연결할 부품 설계
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설계 성공.");
			// 2. 오라클 11g에 연결해보기 (java --- oracle)
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password); // Connection객체로 가져온 값을 변수에 저장
			System.out.println("2. 오라클 연결 성공.");
			
			// 자바는 객체지향언어라 String에 넣은 문자열을 특정한 부품으로 인식하지 못함
			// 특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			// SQL부품 ↓
			String sql = "insert into HR.BBS values (HR.BBS_NO_seq.nextval, ?, ?, ?)"; // 먼저 스트링에 저장하고
			PreparedStatement ps = con.prepareStatement(sql); // SQL부품 PreparedStatment를 활용해 변수에 저장
			// DB는 유일하게 인덱스가 1부터 시작
			ps.setString(1, bag.getTitle());
			ps.setString(2, bag.getContent());
			ps.setString(3, bag.getWriter());
			// => INSERT INTO HR.MEMBER VALUES ('id', 'pw', 'name', 'tel')
			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");
			
			result = ps.executeUpdate(); // insert(C), update(U), delete(D)문만 가능/ sql문 실행결과가 int값이기 때문
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if (result == 1) {
				System.out.println("작성 성공");
				ps.close();
			} else {
				System.out.println("작성 실패");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(result);
		return result;
	}
	
	public BbsVO one(String writer) {
		ResultSet rs = null;
		BbsVO bag = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설계 성공.");
			// 2. 오라클 11g에 연결해보기 (java --- oracle)
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password); // Connection객체로 가져온 값을 변수에 저장
			System.out.println("2. 오라클 연결 성공.");
			
			// 자바는 객체지향언어라 String에 넣은 문자열을 특정한 부품으로 인식하지 못함
			// 특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			// SQL부품 ↓
			// 외래키(FK)설정이 되어있으면 정상적으로 DELETE가 되지 않음
			String sql = "select * from hr.BBS where writer = ?"; // 먼저 스트링에 저장하고
			PreparedStatement ps = con.prepareStatement(sql); // SQL부품 PreparedStatment를 활용해 변수에 저장
			ps.setString(1, writer);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");
			
			rs = ps.executeQuery();
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if (rs.next()) {
				System.out.println("검색 결과 있음");
				int no = rs.getInt(1);
				String title2 = rs.getString(2);
				String content2 = rs.getString(3);
				String writer2 = rs.getString(4);
				
				bag = new BbsVO();
				bag.setNo(no);
				bag.setTitle(title2);
				bag.setContent(content2);
				bag.setWriter(writer2);
				ps.close();
			} else {
				System.out.println("검색 결과 없음");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return bag;
		
	}

}
