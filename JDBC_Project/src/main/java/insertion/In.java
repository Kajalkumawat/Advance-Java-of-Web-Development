package insertion;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/s")
public class In extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public In() {
        super();
        
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		try {
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:4306/hii","root","");
			  PreparedStatement ps=con.prepareStatement("insert into emp(eid,name) values (?,?)"); 
			  ps.setString(1,request.getParameter("eid"));  
		        ps.setString(2,request.getParameter("name")); 
		        int  status=ps.executeUpdate();  
		         System.out.print(status); 
		        con.close();  

		}
		catch(Exception ex) {}
	}
}
