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
    	
        
      //������ش�����

		try {
			//��������д�����ݿ�
			LeJiaService.addKaoQin(courseName,studyTime,date.toString(),states);
			//ת��
			request.setAttribute("KaoQinSuccess", "���ڼ�¼�ɹ���");
			
			//����
			RequestDispatcher rd = request.getRequestDispatcher("keJian.jsp");
			
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
