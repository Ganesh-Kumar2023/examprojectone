package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Getaccountdetailsbyanodao;
import dto.Bankdto;

/**
 * Servlet implementation class Getcustomerdetailsbyanoservlet
 */
public class Getcustomerdetailsbyanoservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Getcustomerdetailsbyanoservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("getcustomerdetailsbyano servlet open");
		Bankdto user=(Bankdto) request.getSession().getAttribute("details");
		Integer ano=0;
		if(user==null)
		{
     	 ano=Integer.parseInt(request.getParameter("ano"));
		}
		else
		{
		 ano=(Integer) request.getAttribute("ano");
		}
     	Bankdto customer=Getaccountdetailsbyanodao.Getdetailsbyano(ano);
     	if(customer!=null)
     	{
     		request.getSession().setAttribute("details", customer);
     		request.getSession().setAttribute("customername", customer.getCname());
     		request.getSession().setAttribute("customerano", customer.getAno());

     		request.getRequestDispatcher("index.jsp").forward(request, response);
     	}
     	else
     	{
     		System.out.println("code error");
     	}

		System.out.println("Getdetailsbyano servlet close ");
	}
	

}
