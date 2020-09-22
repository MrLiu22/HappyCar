package lms;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AddKaoQin")
public class AddKaoQinServlet extends HttpServlet {
	private String states="true";
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        
        String courseName=request.getParameter("courseName");
    	String studyTime=request.getParameter("studyTime");
    	Date date=new Date();
    	
        
      //调用相关处理方法

		try {
			//考勤数据写入数据库
			LeJiaService.addKaoQin(courseName,studyTime,date.toString(),states);
			//转发
			request.setAttribute("KaoQinSuccess", "考勤记录成功！");
			
			//储存
			RequestDispatcher rd = request.getRequestDispatcher("keJian.jsp");
			
			rd.forward(request, response);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.print("数据库操作错误");
			e.printStackTrace();		
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
