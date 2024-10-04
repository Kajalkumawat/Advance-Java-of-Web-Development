package servlet2;

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
		response.setContentType("text/html");
		String contact=request.getParameter("contact");
		String email=request.getParameter("email");
		PrintWriter out=response.getWriter();
		out.println("<h1>education information </h1>");
		out.println("<form action='s3' method='get'>");
		out.println("qualification:<input type='text' name='q'/><br>");
		out.println("university:<input type='text' name='u'/><br>");
		out.println("<button type='submit'>submit</button>");
	}

	

}
