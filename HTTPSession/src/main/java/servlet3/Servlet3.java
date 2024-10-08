package servlet3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
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
		response.setContentType("text/html");
		//Read name and age from Cookies
		Cookie[] cookies = request.getCookies();
		String name = cookies[0].getValue();
		String age = cookies[1].getValue();
		String mobile = cookies[2].getValue();
		String email = cookies[3].getValue();
		
		String qualification = request.getParameter("qualification");
		String university = request.getParameter("university");
		PrintWriter out = response.getWriter();
		out.println("<h1>Please Confirm Details:</h1><hr>");
		out.println("<br>Name: "+name);
		out.println("<br>Age: "+age);
		out.println("<br>Mobile: "+mobile);
		out.println("<br>Email: "+email);
		out.println("<br>Qualification: "+qualification);
		out.println("<br>University: "+university);
	}

	
}
