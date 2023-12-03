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

}
