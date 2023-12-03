package pe.edu.tecsup.springbootapp.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CategoriaRepositoryImpl implements CategoriaRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;  
	
}
