package be.vdab.servlets;

import java.io.IOException;
import java.time.DayOfWeek;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import be.vdab.entities.Adres;
import be.vdab.entities.Gemeente;

/**
 * Servlet implementation class IndexServlet
 */
@WebServlet("/index.htm")
public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String VIEW = "/WEB-INF/JSP/index.jsp";

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		DayOfWeek dag = LocalDateTime.now().getDayOfWeek();
		request.setAttribute("openGesloten",
				dag.equals(DayOfWeek.THURSDAY) || dag.equals(DayOfWeek.MONDAY) ? "gesloten" : "open");
		request.setAttribute("adres", new Adres("Frikandelstraat","12",new Gemeente("Andalousegem",1234)));
		request.getRequestDispatcher(VIEW).forward(request, response);

	}

}
