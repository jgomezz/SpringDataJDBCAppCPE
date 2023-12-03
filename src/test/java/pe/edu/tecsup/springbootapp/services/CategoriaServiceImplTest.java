package pe.edu.tecsup.springbootapp.services;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import pe.edu.tecsup.springbootapp.entities.Categoria;

@SpringBootTest
class CategoriaServiceImplTest {

	@Autowired
	CategoriaService categoriaService;
	
	@Test
	void testListar() throws Exception {
				
		List<Categoria> cats = categoriaService.listar();
	
		// Verifica que existan categorias
		assertEquals(false, cats.isEmpty());
		
	}

}
