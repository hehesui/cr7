<!DOCTYPE html>
<html>
<head>
<title>Insert Data</title>
</head>
<body>
	
	<form action="./InsertData" method="post">
		<p>ID:</p>
		<input type="text" name="id"/>
		<br/>
		<p>password:</p>
		<input type="text" name="string"/>
		<br/><br/><br/>
		<input type="submit"/>
	</form>
</body>
</html>


------------------------------------------------------------------------------------------------------------

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InsertData
 */
@WebServlet("/InsertData")
public class InsertData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertData() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response)
					throws ServletException, IOException
				{
					try {
						
						String str1 = request.getParameter("id");
						
						String str2 = request.getParameter("string");
	
						PrintWriter out = response.getWriter();
						out.println("<html><body><b>" + str1
									+ "</b></body></html>");
						out.println("<html><body><b>" + str2
								+ "</b></body></html>");
					}
					catch (Exception e) {
						e.printStackTrace();
					}
				}

}