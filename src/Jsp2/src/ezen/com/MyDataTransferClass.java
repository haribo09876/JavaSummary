package ezen.com;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ezen.dto.StudentDto;

@WebServlet("/transfer")
public class MyDataTransferClass extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req,
			HttpServletResponse res) throws ServletException, IOException {
		
		ArrayList<StudentDto> studentList = new ArrayList<>();
		
		StudentDto studentDto1 = new StudentDto(1, "Amy", "Java", "dtoClass1");
		StudentDto studentDto2 = new StudentDto(2, "Bella", "Python", "dtoClass2");
		StudentDto studentDto3 = new StudentDto(3, "Chris", "Dart", "dtoClass3");
		
		studentList.add(studentDto1);
		studentList.add(studentDto2);
		studentList.add(studentDto3);
		
		req.setAttribute("studentList", studentList);
		
		RequestDispatcher dispatcher =
				req.getRequestDispatcher("JspCustomTagTest2.jsp");
		
		dispatcher.include(req, res);
		
	}
	
}
