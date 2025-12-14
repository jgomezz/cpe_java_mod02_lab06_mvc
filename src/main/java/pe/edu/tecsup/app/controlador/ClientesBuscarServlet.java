package pe.edu.tecsup.app.controlador;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import pe.edu.tecsup.app.modelo.Cliente;
import pe.edu.tecsup.app.modelo.ClienteNegocio;

/**
 * Servlet implementation class ClientesBuscarServlet
 */
@WebServlet("/ClientesBuscarServlet")
public class ClientesBuscarServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    
	private ClienteNegocio negocio;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClientesBuscarServlet() {
        super();

        this.negocio = new ClienteNegocio();

    }

	/**
	 *  Modificar el codigo para que se pueda mostrar el nombre y apellido de la persona
	 * 
	 * 
	 */
	protected void doGet(HttpServletRequest request, 
						 HttpServletResponse response) throws ServletException, IOException {
	

		String codigoCliente = request.getParameter("txtCodigo");
		
		Cliente ret = this.negocio.buscarCliente(codigoCliente);
		
		System.out.println(ret);
		
	
		// Scope ->  page, request, session, application
		if (ret != null)
			request.setAttribute("llave", ret);
		
		
		// Redirecciona
		RequestDispatcher rd = request.getRequestDispatcher("clientes_buscar.jsp");
		rd.forward(request, response);
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
