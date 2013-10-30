package geometric.util;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class circleServlet
 */
@WebServlet("/circleServlet")
public class circleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public circleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String radius = request.getParameter("radius");
		double r = Double.parseDouble(radius);
		Circle aCircle = new Circle(r);
		double area = aCircle.getArea();
		PrintWriter out = response.getWriter();
		out.println("<html>");
	    out.println("<head>");
	    out.println("<title>Circle</title>");
	    out.println("</head>");
	    out.println("<body>");
	    out.println("The area of the circle with radius equals to " + r + " is " + area);
	    out.println("</body>");
	    out.println("</html>");
	    out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
