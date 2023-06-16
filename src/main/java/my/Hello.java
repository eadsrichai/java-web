package my;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hello
 */
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Hello() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at Wuttiwong: ").append(request.getContextPath());
//		response.getWriter().append("สวัสดี");
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
//		out.println("<h1>Hello สวัสดี</h1>");
//		out.println("</body></html>");
//		out.append("วิทยาลัยเทคนิคพังงา");

		Product p = new Product();
//		p.setId("001");
//		p.setName("Coke");
//		p.setPrice(25.50f);
		
		p.setId(request.getParameter ("id"));
		p.setName(request.getParameter("name"));
		p.setPrice(Float.parseFloat(request.getParameter("price")));
		
		out.print("รหัสสินค้า " + p.getId() + "<br>");
		out.print("ชื่อสินค้า " +p.getName() + "<br>");
		out.print("ราคา " +p.getPrice() + " บาท");
		System.out.println(p.getId());
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
