package com.example.examen.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.examen.dao.Operaciones;
import com.example.examen.daoImpl.PaisDaoIMpl;
import com.example.examen.entity.Pais;

@Service
public class PaisService implements Operaciones<Pais>{
	@Autowired
	private PaisDaoIMpl daoIMpl;

	@Override
	public  int create(Pais t) {
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
	public List<Map<String, Object>>readAll() {
		// TODO Auto-generated method stub
		return daoIMpl.readAll();
	}

	
}
