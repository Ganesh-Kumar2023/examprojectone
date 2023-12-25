package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.GetallTransactiondao;
import dto.Transactiondto;

/**
 * Servlet implementation class Transactionsservlet
 */
public class Transactionsservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Transactionsservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("transactions servlet open");
		//System.out.println(request.getSession().getAttribute("details"));
		Integer ano=(Integer) request.getSession().getAttribute("customerano");
		System.out.println(ano);
		List<Transactiondto> transactiondetailsofcustomer=GetallTransactiondao.Getdetailsbyano(ano);
		System.out.println(transactiondetailsofcustomer);
		request.setAttribute("transactiondetailsofcustomer", transactiondetailsofcustomer);
		request.getRequestDispatcher("transactionview.jsp").forward(request, response);
		System.out.println("transactions servlet close");

	}

}
