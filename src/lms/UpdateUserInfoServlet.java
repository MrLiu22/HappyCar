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

@WebServlet("/UpdateUserInfo")
public class UpdateUserInfoServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//接受提交点名信息
				

				request.setCharacterEncoding("utf-8");
				response.setContentType("textml;charset=utf-8");  
				//提交表单中的学号文本框内容
				String userName = request.getParameter("userName");
				String userName1 = request.getParameter("userName1");
				String password1 = request.getParameter("password1");
				String repassword1 = request.getParameter("repassword1");
				String email1 = request.getParameter("email1");
				String phoneNum1 = request.getParameter("phoneNum1");
				String educa1 = request.getParameter("educa1");
				String hobby1 = request.getParameter("hobby1");
				String sex1 = request.getParameter("sex1");

				//调用相关处理方法

				try {
					//修改用户数据到数据库
					LeJiaService.updateUserInfo(userName, userName1, password1, repassword1, email1,
							phoneNum1, educa1, hobby1, sex1);
					

					
					//转发
					request.setAttribute("UpdateUserSuccess", "用户信息注修改成功！");
					
					//储存
					RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
					
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
