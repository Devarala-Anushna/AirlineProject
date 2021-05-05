import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class  ElectServ extends HttpServlet
{
	public void service(HttpServletRequest req, HttpServletResponse resp)
	{
		try
		{
			resp.setContentType("text/html");
			PrintWriter out = resp.getWriter();
			System.out.println("Service is called...");
			
			String tv = req.getParameter("tv");
			String video = req.getParameter("video");

			out.println("<HTML>");
			out.println("<H1> Electronic Purchase Status </H1>");
			
			HttpSession cart = req.getSession(true);

			if(tv!=null)
			{
				String tvqty = req.getParameter("tvqty");
				cart.setAttribute("tvqty",tvqty);
				out.println("TV purchased : "+tvqty+"<BR>");
			}
			else
				out.println("TV NOT purchased  <BR>");

			if(video!=null)
			{
				String videoqty = req.getParameter("videoqty");
				cart.setAttribute("videoqty",videoqty);
				out.println("VIDEO purchased : "+videoqty+"<BR>");
			}
			else
				out.println("VIDEO NOT purchased  <BR>");
		}
		catch(Exception e)
		{
			System.out.println("Problem is : "+e);
		}
	}//end of service
}
