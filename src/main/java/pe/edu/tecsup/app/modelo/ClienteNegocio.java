package pe.edu.tecsup.app.modelo;

import java.util.HashMap;
import java.util.Map;

public class ClienteNegocio {

	
	private Map<String,String> clientes;
	
	
	public ClienteNegocio() {
		
		this.clientes = new HashMap<String,String>();
		
		this.clientes.put("X001","Jaime");
		this.clientes.put("X002","Silvia");
		this.clientes.put("X003","Maribel");
		
		
	}
	
	
	public String buscarCliente(String codigoCliente) {

		return this.clientes.get(codigoCliente);
		
	}

}
