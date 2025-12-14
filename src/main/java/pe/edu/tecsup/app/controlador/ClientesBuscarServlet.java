package pe.edu.tecsup.app.controlador;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	

		String codigoCliente = request.getParameter("txtcodigo");
		
		String ret = this.negocio.buscarCliente(codigoCliente);
		
		System.out.println(ret);
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
