package com.example.examen.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.examen.service.ProductoService;

@RestController

@RequestMapping("/api/producto")
@CrossOrigin({"*"})
public class ProductoController {
	@Autowired
	private ProductoService ProductoService;
	
	@GetMapping("/all")
	public List<Map<String, Object>> readAll(){		
		return ProductoService.readAll();
	}
}
