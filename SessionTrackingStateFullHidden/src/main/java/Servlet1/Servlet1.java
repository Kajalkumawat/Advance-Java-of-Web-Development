package Servlet1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/s1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Servlet1() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");	
		//request
		String name=request.getParameter("name");
		String age=request.getParameter("age");
		PrintWriter out=response.getWriter();
		out.println("<form action='s2' method='get'/>");
		out.println("contact:<input type='text' name='contact'/><br>");
		out.println("email:<input type='text' name='email'><br>");
		out.println("<input type='hidden' name='name' value="+name+"><br>");
		out.println("<input type='hidden' name='age' value="+age+"><br>");
		out.println("<button type='submit'>submit</button>");
	}

	

}
