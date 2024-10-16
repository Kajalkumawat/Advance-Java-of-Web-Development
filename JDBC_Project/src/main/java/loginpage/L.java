package loginpage;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/h")
public class L extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public L() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String name = request.getParameter("name");
        String url = "jdbc:mysql://localhost:4306/hii";
        String user = "root";
        String password = "";
        try {
        	Class.forName("com.mysql.jdbc.Driver");
        	 Connection connection = DriverManager.getConnection(url, user, password);
        	 String sql = "SELECT * FROM emp WHERE name = ?";
             PreparedStatement statement = connection.prepareStatement(sql);
             statement.setString(1, name);
             ResultSet resultSet = statement.executeQuery();
             if (resultSet.next()) {
                 out.println("<h1>Email found in the database!</h1>");
             } else {
                 out.println("<h1>Email not found in the database!</h1>");
             }

             resultSet.close();
             statement.close();
             connection.close();


        }
        catch(Exception ex) {}
	}

	
}
