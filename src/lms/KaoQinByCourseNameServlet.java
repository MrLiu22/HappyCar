package lms;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns="/KaoQinByCourseName")
public class KaoQinByCourseNameServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		String key = request.getParameter("key");
		
		try {
			
			//ÇëÇó
			List<LeJia> byCourseNameList = LeJiaService.getQueryByCourseName(key);
			//×ª·¢
			request.setAttribute("SearchKaoQin", byCourseNameList);
			//´¢´æ
			RequestDispatcher rd = request.getRequestDispatcher("SearchKaoQinByCourseName.jsp");
			
			rd.forward(request, response);
			
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

	

}
