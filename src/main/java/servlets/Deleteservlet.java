package servlets;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Deleteaccount;
import dao.Transactiondao;
import dao.Updateaccountdao;
import dto.Transactiondto;

/**
 * Servlet implementation class Deleteservlet
 */
public class Deleteservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Deleteservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 System.out.println("delete servlet open");
	 Double amount=Double.parseDouble(request.getParameter("amount"));
		Integer ano=(Integer) request.getSession().getAttribute("customerano");
		int result=Deleteaccount.Deleteaccountnuano(ano);
		if(result!=0)
		{
		response.sendRedirect("logout");	 
		}
	 System.out.println("delete servlet close");	
	}

}
