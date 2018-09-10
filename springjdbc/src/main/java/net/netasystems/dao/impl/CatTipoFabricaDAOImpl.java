package net.netasystems.dao.impl;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import net.netasystem.domain.CatTipoFabrica;
import net.netasystems.dao.CatTipoFabricaDAO;

/**
 * @author NetaSystems/Jorge Saul Fernandez Enriquez
 * 
 *
 */
@Repository
public class CatTipoFabricaDAOImpl implements CatTipoFabricaDAO{
	
	/**
	 * {@link JdbcTemplate} para la crecion de las conexiones 
	 */
	private JdbcTemplate jdbcTamplate;
	
	/**
	 * Contructor con la inicialzacion de la {@link JdbcTemplate}
	 * @param jdbcTamplate
	 */
	@Autowired
	public CatTipoFabricaDAOImpl(JdbcTemplate jdbcTamplate) {
		this.jdbcTamplate=jdbcTamplate;
	}

	/* (non-Javadoc)
	 * @see net.netasystems.dao.CatTipoFabricaDAO#count()
	 */
	public Integer count() {
		Integer counter = jdbcTamplate.
		queryForObject("SELECT COUNT(*) FROM CAT_TIPO_FABRICA", Integer.class);
		return counter;
	}

	/* (non-Javadoc)
	 * @see net.netasystems.dao.CatTipoFabricaDAO#update(net.netasystem.domain.CatTipoFabrica)
	 */
	public Boolean update(CatTipoFabrica cat) {
		if(jdbcTamplate.update("UPDATE CAT_TIPO_FABRICA SET NOMBRE = ?,ESTATUS= ?, FECHAMODIFICACION = ?, IDUSUARIO = ? WHERE IDCATTIPOFABRICA=?",
				cat.getNombre(),cat.getStatus(),cat.getFechaDeModificacion(),cat.getIdUsuario(),cat.getIdTipoFabrica())!=0) {
			return true;
		}else {
			return false;
		}
	}

	/* (non-Javadoc)
	 * @see net.netasystems.dao.CatTipoFabricaDAO#delete(net.netasystem.domain.CatTipoFabrica)
	 */
	public Boolean delete(CatTipoFabrica cat) {
		if(jdbcTamplate.update("DELETE FROM CAT_TIPO_FABRICA WHERE IDCATTIPOFABRICA = ?",
				cat.getIdTipoFabrica())!=0) {
			return true;
		}else {
			return false;
		}
	}

	/* (non-Javadoc)
	 * @see net.netasystems.dao.CatTipoFabricaDAO#selectAll()
	 */
	public List<CatTipoFabrica> selectAll() {
		String sql = "SELECT * FROM CAT_TIPO_FABRICA";
		 
		List<CatTipoFabrica> customers = new ArrayList<CatTipoFabrica>();
		
		List<Map<String,Object>> rows = jdbcTamplate.queryForList(sql);
		for (Map row : rows) {
			CatTipoFabrica cat = new CatTipoFabrica();
			cat.setIdTipoFabrica((BigDecimal)row.get("IDCATTIPOFABRICA"));
			cat.setNombre((String)row.get("NOMBRE"));
			cat.setStatus((String)row.get("ESTATUS"));
			cat.setFechaDeModificacion((Date)row.get("FECHADEMODIFICACION"));
			cat.setIdUsuario((BigDecimal)row.get("IDUSUARIO"));
			customers.add(cat);
		}
			
		return customers;
	}

	/* (non-Javadoc)
	 * @see net.netasystems.dao.CatTipoFabricaDAO#insert(net.netasystem.domain.CatTipoFabrica)
	 */
	public Boolean insert(CatTipoFabrica cat) {
		if(jdbcTamplate.update("INSERT INTO cat_tipo_fabrica VALUES (?,?,?,?,?)",
				cat.getIdTipoFabrica(),cat.getNombre(),cat.getStatus(),cat.getFechaDeModificacion(),
				cat.getIdUsuario())!=0) {
			return true;
		}else {
			return false;
		}
	}
	
}
