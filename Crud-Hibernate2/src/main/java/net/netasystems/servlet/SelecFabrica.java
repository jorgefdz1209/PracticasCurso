package net.netasystems.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.netasystems.domain.CatTipoFabrica;
import net.netasystems.service.CatTipoFabricaService;

/**
 * Servlet implementation class SelecFabrica
 */
/**
 * @author Jesus Leyton
 *
 */
public class SelecFabrica extends HttpServlet {
	private static final long serialVersionUID = 1L; 
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelecFabrica() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("<html>");
		response.getWriter().append("<body>");
		response.getWriter().append("<h1>");
		response.getWriter().append("Tabla Catalogo Tipo Fabrica "+"<br/>");
		response.getWriter().append("</h1>");
		
		response.getWriter().append("<div>");
		response.getWriter().append("<table>");
		response.getWriter().append("<tr "+"id="+ "main"+">");
		response.getWriter().append("<th>"+ "ID" +"</th>");
		response.getWriter().append("<th>"+ "NOMBRE" +"</th>");
		response.getWriter().append("<th>"+ "ESTATUS" +"</th>");
		response.getWriter().append("<th>"+ "FECHA DE MODIFICACION" +"</th>");
		response.getWriter().append("<th>"+ "ID USUARIO" +"</th>");
		response.getWriter().append("</tr>");
		
		System.out.println("Iniciando programa de conexion a base de datos!");
		CatTipoFabricaService service = null;
		try {
			 service = new CatTipoFabricaService();
			 List<CatTipoFabrica> lista = service.getAllRecords();
			 for(CatTipoFabrica c : lista) {
//				 System.out.println(c);
				 response.getWriter().append("<tr>");
				 response.getWriter().append("<td>"+c.getIdCatTipoFabrica() +"</td>");
				 response.getWriter().append("<td>"+c.getNombre() +"</td>");
				 response.getWriter().append("<td>"+c.getStatus() +"</td>");
				 response.getWriter().append("<td>"+c.getFechaModificacion() +"</td>");
				 response.getWriter().append("<td>"+c.getIdUsuario() +"</td>");
				 response.getWriter().append("</tr>");
			 }

		} catch (Exception e) {
			System.out.println("Ha caido en excepcion con mensaje: "+e.getMessage());
			e.printStackTrace();
		} finally {
			try {
				service.close();
			} catch (SQLException e) {
				System.out.println("No se pueden cerrar los recursos: "+e.getMessage());
			}
		}
		response.getWriter().append("</table>");
		response.getWriter().append("</div>");
		
		response.getWriter().append("</body>");
		
		response.getWriter().append("<style>");
		
		response.getWriter().append("h1"+"{"
		+"background-color:#FF5733;"
		+"text-align: center;"
				+"}");
		
		response.getWriter().append("div"+"{"
		+"margin: 150px auto;"
		+"width: 600px;"
				+"}");
		response.getWriter().append("table"+"{"
		+"background-color:white;"
		+"text-align: center;"
		+"border-collapse: collapse;"
		+"width: 100%;"
				+"}");
		
		response.getWriter().append("#main"+"{"
				+"background-color:#FF5733;"
				
						+"}");
		response.getWriter().append("th,td"+"{"
				+"padding: 20px;"
				
						+"}");
	
		response.getWriter().append("tr:nth-child(even)"+"{"
				+"background-color:#ddd;"
				+"}");
		
		response.getWriter().append("</stile>");
		response.getWriter().append("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
