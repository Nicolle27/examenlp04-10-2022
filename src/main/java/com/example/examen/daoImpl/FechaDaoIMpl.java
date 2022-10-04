package com.example.examen.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.examen.dao.Operaciones;
import com.example.examen.entity.Fecha;

@Component
public class FechaDaoIMpl implements Operaciones<Fecha>{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Fecha t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Fecha t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Fecha read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public  List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		String SQL = "SELECT OrderID, OrderDate\r\n"
				+ "FROM Customers C, Orders O\r\n"
				+ "WHERE C.CustomerID = O.CustomerID limit 5;";
		return jdbcTemplate.queryForList(SQL);
	}

}
