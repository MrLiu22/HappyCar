package lms;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/UserLogin")
public class UserLoginServlet extends HttpServlet {
	
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("textml;charset=utf-8");  
		//提交登录表单中的文本框内容
		String user_name = request.getParameter("user_name");
		String passwords = request.getParameter("passwords");
		

		//调用相关处理方法

		try {
			
			List<UserInfo> loginList = LeJiaService.getPasswordByUserName(user_name,passwords);
			if(loginList.isEmpty()||user_name==null||passwords==null){
				//转发
				request.setAttribute("userFault", "用户名不存在或密码错误！请重新登录！");
				RequestDispatcher rd = request.getRequestDispatcher("LoginFault.jsp");
				rd.forward(request, response);
				
			}
			else{
				
				List<UserInfo> getUserList = LeJiaService.getAllByUserName(user_name);
				
				if(user_name!=null&&passwords!=null){
					//转发
					request.setAttribute("getUser",getUserList);
					
					//储存
					RequestDispatcher rad = request.getRequestDispatcher("personInfo.jsp");
					
					rad.forward(request, response);
				}
			}

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
