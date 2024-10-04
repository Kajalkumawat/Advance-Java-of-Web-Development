package servlet3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/s3")
public class Servlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Servlet3() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String name=request.getParameter("name");
		String age=request.getParameter("age");
		
		String contact=request.getParameter("contact");
		String email=request.getParameter("email");
		
		String quali=request.getParameter("q");
		String uni=request.getParameter("u");
		PrintWriter out=response.getWriter();
		
		out.println("name "+name+"<br>");
		out.println("age "+age+"<br>");
		out.println("contact "+contact+"<br>");
		out.println("email "+email+"<br>");
		out.println("quali "+quali+"<br>");
		out.println("uni"+uni+"<br>");
	}


}
