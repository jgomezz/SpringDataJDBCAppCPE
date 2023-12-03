package pe.edu.tecsup.springbootapp.repositories;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import pe.edu.tecsup.springbootapp.entities.Producto;


class ProductoRowMapper implements RowMapper<Producto> {

	@Override
	public Producto mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Producto prod = new Producto();

		// TODO
		
		return prod;
	}

}
@Repository
public class ProductoRepositoryImpl implements ProductoRepository {

	private static Logger log = LoggerFactory.getLogger(ProductoRepositoryImpl.class);

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public List<Producto> listar() throws Exception {
		log.info("call listar()");

		String sql = "SELECT * FROM productos";

		List<Producto> productos 
				= jdbcTemplate.query(sql, new ProductoRowMapper());

		return productos;
	}

}
