package web;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.math3.util.CombinatoricsUtils;

/*
 * http://localhost:8080/factorial?numero=7
 */
@SuppressWarnings("serial")
@WebServlet("/factorial")
public class FactorialServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int num=0;
		double factorial;
		try {
			String param = req.getParameter("numero");
			num = Integer.parseInt(param);
			factorial = CombinatoricsUtils.factorial(num);
		} catch (NumberFormatException  e) {
			resp.getWriter().println("El parametro numero no es correcto");
			throw new RuntimeException("Error en el parametro numero al parsearlo a entero",e);
		} catch (RuntimeException  e) {
			resp.getWriter().println("Error al calcular el factorial de "+num);
			throw new RuntimeException("Error al calcular el factorial de "+num,e);
		}

		resp.getWriter().println("El factorial de "+num+" es "+factorial);
	}

}

