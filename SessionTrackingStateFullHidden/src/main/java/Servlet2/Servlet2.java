package Servlet2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/s2")
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Servlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//name age contact email
		response.setContentType("text/html");
		String name=request.getParameter("name");
		String age=request.getParameter("age");
		String contact=request.getParameter("contact");
		String email=request.getParameter("email");
		PrintWriter out=response.getWriter();
		out.println("<form action='s3' method='get'>");
		out.println("university:<input type='text' name='uni'/><br>");
		out.println("qualification:<input type='text' name='q'><br>");
		out.println("<input type='hidden' name='name' value="+name+"><br>");
		out.println("<input type='hidden' name='age' value="+age+"><br>");
		out.println("<input type='hidden' name='contact' value="+contact+"><br>");
		out.println("<input type='hidden' name='email' value="+email+"><br>");
		out.println("<button type='submit'>submit</button>");
		out.println("</form>");
	}
}
