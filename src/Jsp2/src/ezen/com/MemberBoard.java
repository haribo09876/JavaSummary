package ezen.com;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MemberBoard extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request
			, HttpServletResponse response)
			throws ServletException, IOException {
		
		System.out.println("form과 servlet");
		System.out.println("MemberBoard");
		System.out.println("doGet");
		
		String abc = request.getParameter("abc");
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		System.out.println(abc);
		System.out.println(id);
		System.out.println(pwd);
	}
	
	@Override
	protected void doPost(HttpServletRequest request
			, HttpServletResponse response)
					throws ServletException, IOException {
	
		String email = request.getParameter("email");
		String id = request.getParameter("id");
		String money = request.getParameter("money");
		
		System.out.println(email);
		System.out.println(id);
		System.out.println(money);
	}
	
}
