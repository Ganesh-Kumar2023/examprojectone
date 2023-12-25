package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Createaccountdao;
import dto.Bankdto;

/**
 * Servlet implementation class Createaccountservlet
 */
public class Createaccountservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Createaccountservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Insert details servlet open");
		String Name=request.getParameter("name");
		String Gender=request.getParameter("gender");
		String Branch=request.getParameter("branch");
		Double balance=Double.parseDouble(request.getParameter("minimumamount"));
		System.out.println(Name+" "+Gender+" "+Branch+" "+balance);
		Bankdto dto=new Bankdto(Name, Gender, Branch, balance);
		Createaccountdao.Insertdetails(dto);
		response.sendRedirect("index.jsp");
		System.out.println("Insert details servlet close");
	}

}
