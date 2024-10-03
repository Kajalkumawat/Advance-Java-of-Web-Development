package sendredirection;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SendRedirection1")
public class SendRedirection1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public SendRedirection1() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	out.print("<a href='https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=713930225169&hvpos=&hvnetw=g&hvrand=893980782576273003&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061782&hvtargid=kwd-64107830&hydadcr=14452_2402225&gad_source=1'>print</a>");;
	}

}
