
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");

		String name = request.getParameter("name");
		String password = request.getParameter("password");

//		System.out.println("name" + name);
//		System.out.println("pwd" + password);

		String html = null;
		if ("admin".equals(name) && "123".equals(password))
//			html = "<div style='color:green'>����ɹ�</div>";
//			request.getRequestDispatcher("success.html").forward(request, response);
			response.sendRedirect("success.html");
		else
//			html = "<div style='color:red'>����ʧ��</div>";
//			request.getRequestDispatcher("fail.html").forward(request, response);
			response.sendRedirect("fail.html");

//		PrintWriter pw = response.getWriter();
//		pw.println(html);
	}
}