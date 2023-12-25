package servlets;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Transactiondao;
import dao.Updateaccountdao;
import dto.Transactiondto;

/**
 * Servlet implementation class Namemodificationservlet
 */
public class Namemodificationservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Namemodificationservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("namemodification servlet open");
		String name=request.getParameter("name");
		Integer ano=(Integer) request.getSession().getAttribute("customerano");
		int result=Updateaccountdao.Updatename(ano, name);
		if(result!=0)
		{
		request.setAttribute("ano", ano);
		request.getRequestDispatcher("getcustomerdetailsbyano").forward(request, response);
		}
		System.out.println("namemodification servlet close");

	}

}
