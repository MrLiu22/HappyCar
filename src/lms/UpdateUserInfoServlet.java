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
		//�����ύ������Ϣ
				

				request.setCharacterEncoding("utf-8");
				response.setContentType("textml;charset=utf-8");  
				//�ύ���е�ѧ���ı�������
				String userName = request.getParameter("userName");
				String userName1 = request.getParameter("userName1");
				String password1 = request.getParameter("password1");
				String repassword1 = request.getParameter("repassword1");
				String email1 = request.getParameter("email1");
				String phoneNum1 = request.getParameter("phoneNum1");
				String educa1 = request.getParameter("educa1");
				String hobby1 = request.getParameter("hobby1");
				String sex1 = request.getParameter("sex1");

				//������ش�����

				try {
					//�޸��û����ݵ����ݿ�
					LeJiaService.updateUserInfo(userName, userName1, password1, repassword1, email1,
							phoneNum1, educa1, hobby1, sex1);
					

					
					//ת��
					request.setAttribute("UpdateUserSuccess", "�û���Ϣע�޸ĳɹ���");
					
					//����
					RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
					
					rd.forward(request, response);
					
					
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
