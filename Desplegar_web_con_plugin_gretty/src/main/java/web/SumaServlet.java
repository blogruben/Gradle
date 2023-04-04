package web;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@SuppressWarnings("serial")
@WebServlet("/sumar")
public class SumaServlet extends HttpServlet {

	/*
	 * http://localhost:8080/sumar?num1=2&num2=3
	 * Resultado -> La suma de 2 y 3 es 5
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String param1 = req.getParameter("num1");
		String param2 = req.getParameter("num2");

		try {
			Integer.parseInt(param1);
		} catch (Exception e) {
			resp.getWriter().println("Especifique parametro <h3>num1</h3> correcto");
			throw new RuntimeException("El parametro de entrada param1 es "+param1+".",e);
		}
		
		try {
			Integer.parseInt(param2);
		} catch (Exception e) {
			resp.getWriter().println("Especifique parametro num2 correcto");
			throw new RuntimeException("El parametro de entrada param2 es "+param2+".",e);
		}
		
		int num1 = Integer.valueOf(param1);
		int num2 = Integer.valueOf(param2);
		resp.getWriter().println("La suma de "+num1+" y "+num2+" es "+ Integer.sum(num1, num2));
		
	}

}



