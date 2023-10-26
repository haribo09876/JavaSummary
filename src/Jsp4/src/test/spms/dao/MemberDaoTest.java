package test.spms.dao;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import spms.dao.MemberDao;

public class MemberDaoTest {

	@Test
	public void testMemberBatch() throws Exception {
			
		Connection conn = null;
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "jsp";
		String password = "jsp12";
		
		Class.forName(driver);
		
		conn = DriverManager.getConnection(url, user, password);
		
		MemberDao memberDao = new MemberDao();
		memberDao.setConnection(conn);
		
		int no = 1;
		
		int resultNum = memberDao.memberBatch(no);
	
		assertEquals(1, resultNum);
	}

}
