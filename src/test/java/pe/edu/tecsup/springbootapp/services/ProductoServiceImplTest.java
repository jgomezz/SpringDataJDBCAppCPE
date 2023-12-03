package pe.edu.tecsup.springbootapp.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import pe.edu.tecsup.springbootapp.entities.Producto;

@SpringBootTest
class ProductoServiceImplTest {

	@Autowired
	ProductoService productoService;

	
	@Test
	void testListar() throws Exception {
		
		List<Producto> prods = productoService.listar();
		
		// Verifica que existan productos
		//     VALOR_ESPERADO  VALOR_OBTENIDO
		assertEquals(false, prods.isEmpty());
	}

	
	@Test
	void testRegistar() throws Exception {
		
		List<Producto> productos = productoService.listar();
		
		int totalAntes = productos.size();
		
		Producto producto = new Producto();
		producto.setCategorias_id(1L);
		producto.setNombre("AMD");
		producto.setDescripcion("AMD X10");
		producto.setPrecio(280.0);
		producto.setStock(6);
		producto.setEstado(1);
		
		// Grabar producto
		productoService.registrar(producto);
		
		//
		productos = productoService.listar();
		int totalDespues = productos.size();
		
		// Verifica si hay un registro mas
		assertEquals(1,totalDespues - totalAntes);
		
	}

	@Test
	public void testEliminar() throws Exception {
		
		List<Producto> productos = productoService.listar();
		int totalAntes = productos.size();
		
		if (productos.isEmpty()) return; // test pass
		
		Producto ultimoProducto = productos.get(productos.size() - 1);
		
		productoService.eliminar(ultimoProducto.getId());
		
		productos = productoService.listar();
		int totalDespues = productos.size();
		
		assertEquals(1,totalAntes - totalDespues);
	}

}
