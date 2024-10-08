package servlet2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/s2")
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Servlet2() {
        super();
       
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//contact email 
		response.setContentType("text/html");
		String mobile =request.getParameter("mobile");
		String email=request.getParameter("email");
		
		Cookie mobileCookie = new Cookie("mobile", mobile);
		Cookie emailCookie = new Cookie("email", email);
		
		response.addCookie(mobileCookie);
		response.addCookie(emailCookie);
		
		PrintWriter out = response.getWriter();
		out.println("<h1>Education Details</h1><hr>");
		out.println("<form action='s3' method='get'>");
		out.println("Qualification : <input type='text' name='qualification'><br>"); 
		out.println("University : <input type='text' name='university'><br>"); 
		 out.println("<input type='submit' value='Submit'> <br>");
		out.println("</form>");

	}
}
