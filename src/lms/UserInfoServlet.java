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

@WebServlet("/UserInfo")
public class UserInfoServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//�����ύ������Ϣ
				

				request.setCharacterEncoding("utf-8");
				response.setContentType("textml;charset=utf-8");  
				//�ύ���е�ѧ���ı�������
				String userName = request.getParameter("userName");
				String password = request.getParameter("password");
				String repassword = request.getParameter("repassword");
				String email = request.getParameter("email");
				String phoneNum = request.getParameter("phoneNum");
				String educa = request.getParameter("educa");
				String hobby = request.getParameter("hobby");
				String sex = request.getParameter("sex");

				//������ش�����

				try {
					//�û�����д�����ݿ�
					LeJiaService.addUser(userName,password,
							repassword,email,phoneNum,educa,hobby,sex);
					

					
					//ת��
					request.setAttribute("userSuccess", "�û�ע��ɹ���");
					
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
