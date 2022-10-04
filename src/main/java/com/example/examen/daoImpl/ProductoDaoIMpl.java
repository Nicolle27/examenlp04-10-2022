package com.example.examen.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.examen.dao.Operaciones;
import com.example.examen.entity.Producto;

@Component
public class ProductoDaoIMpl implements Operaciones<Producto>{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Producto t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Producto t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Producto read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public  List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		String SQL = "select c.CategoryName as categoria,count(p.CategoryID) as cantidad from products p \r\n"
				+ "inner join categories c\r\n"
				+ "on  p.CategoryID =c.CategoryID\r\n"
				+ "group by p.CategoryID;";
		return jdbcTemplate.queryForList(SQL);
	}

	
	
}
