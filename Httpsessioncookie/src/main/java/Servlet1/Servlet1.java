package Servlet1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/s1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Servlet1() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		
		HttpSession session = request.getSession();
		session.setAttribute("name", name);
		session.setAttribute("age", age);
		PrintWriter out = response.getWriter();
		
		out.println("<h1>Contact Information</h1><hr>");
		out.println("<form action='s2' method='get'>");
		out.println("Mobile no. : <input type='text' name='mobile'> <br>");
		out.println("Email Id : <input type='text' name='email'> <br>");
		out.println("<input type='submit' value='Next'> <br>");
		out.println("</form>");
	}
}
