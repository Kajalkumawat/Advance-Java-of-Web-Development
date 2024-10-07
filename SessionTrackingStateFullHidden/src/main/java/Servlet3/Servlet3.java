package Servlet3;

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
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/htm");
		String name=request.getParameter("name");
		String age=request.getParameter("age");
		String contact=request.getParameter("contact");
		String email=request.getParameter("email");
		String university=request.getParameter("uni");
		String qulaification=request.getParameter("q");
		PrintWriter out=response.getWriter();
		out.println("name"+name);
		out.println("age"+age);
		out.println("contact"+contact);
		out.println("email"+email);
		out.println("uni"+university);
		out.println("quali"+qulaification);
	}


}
