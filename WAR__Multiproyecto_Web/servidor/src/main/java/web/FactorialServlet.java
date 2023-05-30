package web;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import simple.Calculadora;

@WebServlet("/factorial")
public class FactorialServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Valor de 'app' es "+req.getServletContext().getInitParameter("app"));
		Calculadora calculadora = new Calculadora();
		String parametro = req.getParameter("numero").replace(",", ".");
		if (parametro != null && !parametro.equals("")) {
			double decimal = Double.valueOf(parametro);
			req.setAttribute("redondeo", calculadora.redondeo(decimal) );
			req.setAttribute("factorial", calculadora.factorial(decimal) );
		}
		req.getRequestDispatcher("index.jsp").forward(req, resp);
	}
   

}
