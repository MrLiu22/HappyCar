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
		//�ύ��¼���е��ı�������
		String user_name = request.getParameter("user_name");
		String passwords = request.getParameter("passwords");
		

		//������ش�����

		try {
			
			List<UserInfo> loginList = LeJiaService.getPasswordByUserName(user_name,passwords);
			if(loginList.isEmpty()||user_name==null||passwords==null){
				//ת��
				request.setAttribute("userFault", "�û��������ڻ�������������µ�¼��");
				RequestDispatcher rd = request.getRequestDispatcher("LoginFault.jsp");
				rd.forward(request, response);
				
			}
			else{
				
				List<UserInfo> getUserList = LeJiaService.getAllByUserName(user_name);
				
				if(user_name!=null&&passwords!=null){
					//ת��
					request.setAttribute("getUser",getUserList);
					
					//����
					RequestDispatcher rad = request.getRequestDispatcher("personInfo.jsp");
					
					rad.forward(request, response);
				}
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.print("���ݿ��������");
			e.printStackTrace();		
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
