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
 * Servlet implementation class Depositeservlet
 */
public class Depositeservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Depositeservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("deposite servlet");
		Double amount=Double.parseDouble(request.getParameter("amount"));
		Integer ano=(Integer) request.getSession().getAttribute("customerano");
		String date=LocalDateTime.now().toString();
		int result=Updateaccountdao.Depositemoney(ano, amount);
		if(result!=0)
		{
		Transactiondto dto=new Transactiondto(date, amount , "deposite", ano);
		Transactiondao.inserttransaction(dto);
		request.setAttribute("ano", ano);
		request.getRequestDispatcher("getcustomerdetailsbyano").forward(request, response);
		}
	}

}
