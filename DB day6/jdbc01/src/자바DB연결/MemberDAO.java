package 자바DB연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MemberDAO {

	public void insert() {
		// 1. 오라클 11g와 연결할 부품 설계
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
			String sql = "insert into HR.MEMBER values ('win7', 'win7', 'win7', 'win7')"; // 먼저 스트링에 저장하고
			PreparedStatement ps = con.prepareStatement(sql); // SQL부품 PreparedStatment를 활용해 변수에 저장
			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");
			
			ps.executeUpdate(); // insert(C), update(U), delete(D)문만 가능/ sql문 실행결과가 int값이기 때문
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
