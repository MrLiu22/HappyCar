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


@WebServlet(urlPatterns="/KaoQinByStudyTime")
public class KaoQinByStudyTimeServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		String searchTime = request.getParameter("searchTime");
		
		try {
			
			//ÇëÇó
			List<LeJia> byStudyTimeList = LeJiaService.getKaoQinByStudyTime(searchTime);
			//×ª·¢
			request.setAttribute("byStudyTimeList", byStudyTimeList);
			//´¢´æ
			RequestDispatcher rd = request.getRequestDispatcher("KaoQinByStudyTime.jsp");
			
			rd.forward(request, response);
			
			System.out.println(searchTime);
			
			for (LeJia leJia : byStudyTimeList) {
				System.out.println(leJia.getCourseName()+" "+leJia.getStudyTime()+" "+leJia.getDate());
			}
			
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

	

}
