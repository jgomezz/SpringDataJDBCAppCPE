package pe.edu.tecsup.springbootapp.services;

import java.util.List;

import pe.edu.tecsup.springbootapp.entities.Producto;

public interface ProductoService {

	List<Producto> listar() throws Exception;
	
	void registrar(Producto producto) throws Exception;
	
	void eliminar(Long id) throws Exception;

}
