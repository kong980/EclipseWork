import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletTest1 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		resp.setCharacterEncoding("euc-kr");

//		String name = req.getParameter("name");
//		String age = req.getParameter("age");
//		
//		System.out.println("get : " + name + ", " + age);
//		PrintWriter out = resp.getWriter();
//		out.println("<html><body>");
//		out.println("<ul>");
//		out.println("<li>이름 : " + name + "</li>");
//		out.println("<li>나이 : " + age + "</li>");
//		out.println("</body></html>");
//		out.close();
		
		doPost(req,resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("euc-kr");
		
		String name = req.getParameter("name");
		String age = req.getParameter("age");
		
//		System.out.println("post : " + name + ", " + age);
		System.out.println(req.getMethod() + " : " + name + ", " + age);
		
		
		PrintWriter out = resp.getWriter();
		out.println("<html><body>");
		out.println("<ul>");
		out.println("<li>이름 : " + name + "</li>");
		out.println("<li>나이 : " + age + "</li>");
		out.println("</body></html>");
		out.close();
	}

}
