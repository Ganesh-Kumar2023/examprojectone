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

public class Withdrawservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Withdrawservlet() {
        super();    
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("withdraw servlet");
		Double amount=Double.parseDouble(request.getParameter("amount"));
		Integer ano=(Integer) request.getSession().getAttribute("customerano");
		String date=LocalDateTime.now().toString();
		int result=Updateaccountdao.Withdrawmoney(ano, amount);
		if(result!=0)
		{
		Transactiondto dto=new Transactiondto(date, amount , "withdraw", ano);
		Transactiondao.inserttransaction(dto);
		request.setAttribute("ano", ano);
		request.getRequestDispatcher("getcustomerdetailsbyano").forward(request, response);
		}
		else
		{
			String errormsg="your entering balace is more than available balance in your account please enter amount which is in range of your account";
			request.setAttribute("errormsg", errormsg);
			request.getRequestDispatcher("withdraw.jsp").forward(request, response);
		}
	}

}
