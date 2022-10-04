package com.example.examen.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.examen.dao.Operaciones;
import com.example.examen.entity.Pais;

@Component
public class PaisDaoIMpl implements Operaciones<Pais>{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Pais t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Pais t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Pais read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public  List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		String SQL = "SELECT o.OrderID, o.ShipCountry FROM orders o JOIN customers c ON o.CustomerID = c.CustomerID limit 10;";
		return jdbcTemplate.queryForList(SQL);
	}

}
