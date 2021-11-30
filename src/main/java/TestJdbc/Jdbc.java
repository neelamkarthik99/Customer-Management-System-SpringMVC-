package TestJdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Jdbc
 */
@WebServlet("/Jdbc")
public class Jdbc extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Jdbc() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String url = "jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false";
		String username = "springstudent";
		String password = "springstudent";
		String driver = "com.mysql.jdbc.Driver";
		try 
		{
			PrintWriter pw = response.getWriter();
			pw.println("Connecting to Database");
			Class.forName(driver);
			Connection c = DriverManager.getConnection(url, username, password);
			pw.println("connected");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
