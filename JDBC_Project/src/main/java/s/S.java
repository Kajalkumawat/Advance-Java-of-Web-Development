package s;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/S")
public class S extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public S() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String driver="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:4306/hii";
		String user ="root";
		String password="";
		try {
		PrintWriter out=response.getWriter();	
		Class.forName(driver);//load driver 
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from emp");
		while(rs.next()) {
			out.println(rs.getInt("eid")+" "+rs.getString("name"));
		}
		}
		catch(Exception ex) {
			
		}
	}
}
