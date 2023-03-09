package 자바DB연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Locale;

import 화면DB연결.MemberVO;

public class MemberDAO2 {
	
	public int delete(MemberVO bag) {
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
			String sql = "delete from hr.MEMBER where id = ? AND pw = ?"; // 먼저 스트링에 저장하고
			PreparedStatement ps = con.prepareStatement(sql); // SQL부품 PreparedStatment를 활용해 변수에 저장
			ps.setString(1, bag.getId());
			ps.setString(2, bag.getPw());
			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");
			
			result = ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if (result == 1) {
				System.out.println("탈퇴 성공");
				ps.close();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(result);
		return result;
	}
	
	public int update(MemberVO bag) {
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
			String sql = "update hr.MEMBER set tel = ? where id = ? AND pw = ?" ; // 먼저 스트링에 저장하고
			PreparedStatement ps = con.prepareStatement(sql); // SQL부품 PreparedStatment를 활용해 변수에 저장
			ps.setString(1, bag.getTel());
			ps.setString(2, bag.getId());
			ps.setString(3, bag.getPw());
			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");
			
			result = ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if (result == 1) {
				System.out.println("수정 성공!");
				ps.close();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(result);
		return result;
	}
	
	public int update1(MemberVO bag) {
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
			String sql = "update hr.MEMBER set pw = ? where id = ?" ; // 먼저 스트링에 저장하고
			PreparedStatement ps = con.prepareStatement(sql); // SQL부품 PreparedStatment를 활용해 변수에 저장
			ps.setString(2, bag.getId());
			ps.setString(1, bag.getPw());
			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");
			
			result = ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if (result == 1) {
				System.out.println("수정 성공!");
				ps.close();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(result);
		return result;
	}
	
	
	public int insert(MemberVO bag) {
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
			String sql = "insert into HR.MEMBER values (?, ?, ?, ?)"; // 먼저 스트링에 저장하고
			PreparedStatement ps = con.prepareStatement(sql); // SQL부품 PreparedStatment를 활용해 변수에 저장
			ps.setString(1, bag.getId()); // DB는 유일하게 인덱스가 1부터 시작
			ps.setString(2, bag.getPw());
			ps.setString(3, bag.getName());
			ps.setString(4, bag.getTel());
			// => INSERT INTO HR.MEMBER VALUES ('id', 'pw', 'name', 'tel')
			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");
			
			result = ps.executeUpdate(); //1
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if(result == 1) {
				System.out.println("회원가입 성공!");
				ps.close();
			}

		} catch (Exception e) {
			// insert가 실패한 경우 catch가 실행
			// result = 0;
			e.printStackTrace();
		}
		System.out.println(result);
		return result;
	}
	
	public MemberVO one(String id) {
		// ResultSet > 기본형 데이터만 값으로 초기화, 참조형은 주소가 들어가 있어 null로 초기화
		ResultSet rs = null; // 컬럼명 + 결과 데이터를 담고 있는 테이블
		MemberVO bag = null;
		
		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");
			Locale.setDefault(Locale.US); //맥 locale에러나신 분들만!!!
			
			// 2.오라클 11g에 연결해보자.(java --- oracle) 
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password); //Connection
			//String data = JOptionPane.showInputDialog("이름입력"); //String, 임아무개 
			System.out.println("2. 오라클 연결 성공.");
			
			String sql = "select * from hr.MEMBER where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql); //PreparedStatement
			ps.setString(1, id);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");
			
			rs = ps.executeQuery();
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if(rs.next()) { // 검색 결과가 있는이 여부는 rs.next(). true 이면 있다. false이면 없다.
				System.out.println("검색 결과 있음");
				String id2 = rs.getString(1);
				String pw2 = rs.getString(2);
				String name2 = rs.getString(3);
				String tel2 = rs.getString(4);
				System.out.println(id2 + " " + pw2 + " " + name2 + " " + tel2);
				bag = new MemberVO();
				bag.setId(id2);
				bag.setPw(pw2);
				bag.setName(name2);
				bag.setTel(tel2);
			} else {
				System.out.println("검색 결과 없음");
			}
			//System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return bag;
		
	}
	

	public int login(MemberVO bag1) {
		// ResultSet > 기본형 데이터만 값으로 초기화, 참조형은 주소가 들어가 있어 null로 초기화
		ResultSet rs = null; // 컬럼명 + 결과 데이터를 담고 있는 테이블
		int result = 0;
		
		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");
			Locale.setDefault(Locale.US); //맥 locale에러나신 분들만!!!
			
			// 2.오라클 11g에 연결해보자.(java --- oracle) 
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password); //Connection
			//String data = JOptionPane.showInputDialog("이름입력"); //String, 임아무개 
			System.out.println("2. 오라클 연결 성공.");
			
			String sql = "select * from hr.MEMBER where id = ? AND pw = ? ";
			PreparedStatement ps = con.prepareStatement(sql); //PreparedStatement
			ps.setString(1, bag1.getId());
			ps.setString(2, bag1.getPw());
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");
			
			rs = ps.executeQuery();
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if(rs.next()) { // 검색 결과가 있는이 여부는 rs.next(). true 이면 있다. false이면 없다.
				System.out.println("검색 결과 있음");
				result = 1;
			} else {
				System.out.println("검색 결과 없음");
			}
			//System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
		
	}

}
