package pe.edu.tecsup.springbootapp.repositories;

import java.util.List;

import pe.edu.tecsup.springbootapp.entities.Producto;

public interface ProductoRepository {
	
	List<Producto> listar() throws Exception;

	void registrar(Producto producto) throws Exception;
	
	void eliminar(Long id) throws Exception;

}
