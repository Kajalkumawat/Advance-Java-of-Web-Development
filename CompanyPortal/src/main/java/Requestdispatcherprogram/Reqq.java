package Requestdispatcherprogram;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/company")
public class Reqq extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Reqq() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		//email request 
		String email=request.getParameter("email");
		//password request 
		String password=request.getParameter("password");
		if(email.equals("abc") && password.equals("123")) {
			//another :forward part of request dispacther 
			RequestDispatcher rd=request.getRequestDispatcher("hello");
			rd.forward(request, response);
		}
		else if(email.equals("abcd")&& password.equals("1234")) {
			//html page 
			RequestDispatcher rd=request.getRequestDispatcher("hi.html");
			rd.forward(request, response);
		}
		else {
			//same page :include part of request dispachter 
			RequestDispatcher rd=request.getRequestDispatcher("login.html");
			rd.include(request, response);
		};
	} 
}
