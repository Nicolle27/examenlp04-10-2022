package com.example.examen.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.examen.dao.Operaciones;
import com.example.examen.daoImpl.FechaDaoIMpl;
import com.example.examen.entity.Fecha;

@Service
public class FechaService implements Operaciones<Fecha>{
	@Autowired
	private FechaDaoIMpl daoIMpl;

	@Override
	public  int create(Fecha t) {
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
	public List<Map<String, Object>>readAll() {
		// TODO Auto-generated method stub
		return daoIMpl.readAll();
	}

}
