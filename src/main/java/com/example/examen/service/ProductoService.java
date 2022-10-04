package com.example.examen.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.examen.dao.Operaciones;
import com.example.examen.daoImpl.ProductoDaoIMpl;
import com.example.examen.entity.Producto;

@Service
public class ProductoService implements Operaciones<Producto>{
	@Autowired
	private ProductoDaoIMpl daoIMpl;

	@Override
	public  int create(Producto t) {
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
	public List<Map<String, Object>>readAll() {
		// TODO Auto-generated method stub
		return daoIMpl.readAll();
	}

	
	
}
