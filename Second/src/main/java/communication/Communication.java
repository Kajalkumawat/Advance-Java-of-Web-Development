package communication;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Communication
 */
@WebServlet("/print")
public class Communication extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Communication() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//it is used to convert text file into html response.setContentType("text/html");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>table</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<table border='2'>");
		out.println("<thead>");
		out.println("<tr>");
		out.println("<th>name</th>");
		out.println("<th>fname</th>");
		out.println("<tr>");
		out.println("</thead>");
		out.println("<tbody>");
		out.println("<tr>");
		out.println("<td>manish</td>");
		out.println("<td>manish</td>");
		out.println("</tr>");
		out.println("</tbody>");
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
