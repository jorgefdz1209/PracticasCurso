package net.netasystem.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.netasystem.domain.CatTipoFabrica;
import net.netasystem.service.CatTipoFabricaService;

/**
 * Servlet implementation class Resultados
 */
public class Resultados extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Resultados() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CatTipoFabricaService service = null;
		List<CatTipoFabrica> lista;		
		try {
			service = new CatTipoFabricaService();
			lista = service.getAllRecords();
			response.getWriter().append("<html>");
			response.getWriter().append("<body>");
			response.getWriter().append("<style type=\"text/css\">table tr:nth-child(even) { background-color: #eee;}table tr:nth-child(odd) { background-color: #fff;}</style>");
			response.getWriter().append("<table class=\"egt\">");
			response.getWriter().append("<tbody>");
			response.getWriter().append("<tr>");
			response.getWriter().append("<th>Id </th>");
			response.getWriter().append("<th>Nombre </th>");
			response.getWriter().append("<th>Estatus</th>");
			response.getWriter().append("<th>Fecha Modificaci&oacuten</th>");
			response.getWriter().append("<th>Id Usuario</th>");
			response.getWriter().append("</tr>");
			for (CatTipoFabrica c : lista) {
				response.getWriter().append("<tr>");
				response.getWriter().append("<td>"+c.getIdTipoFabrica()+"</td>");
				response.getWriter().append("<td>"+c.getNombre()+"</td>");
				response.getWriter().append("<td>"+c.getStatus()+"</td>");
				response.getWriter().append("<td>"+c.getFechaDeModificacion()+"</td>");
				response.getWriter().append("<td>"+c.getIdUsuario()+"</td>");
				response.getWriter().append("</tr>");
			}
			response.getWriter().append("</tbody>");
			response.getWriter().append("</table>");
			response.getWriter().append("</body>");
			response.getWriter().append("</html>");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e){
			e.printStackTrace();
		}finally {
			try {
				service.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
