package pe.edu.tecsup.app.modelo;

import java.util.HashMap;
import java.util.Map;

public class ClienteNegocio {

	
	private Map<String,Cliente> clientes;
	
	
	public ClienteNegocio() {
		
		this.clientes = new HashMap<String,Cliente>();
		
		this.clientes.put("X001",new Cliente("Jaime","Gomez"));
		this.clientes.put("X002",new Cliente("Silvia","Alegria"));
		this.clientes.put("X003",new Cliente("Maribel","Saldaña"));
		
		
	}
	
	
	public Cliente buscarCliente(String codigoCliente) {

		return this.clientes.get(codigoCliente);
		
	}

}
