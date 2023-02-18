package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.modelo.Item;
import com.example.demo.repository.IItemRepo;

public interface IItemService {
	
	
	public void ingresar(String stock);
	
	public Item buscarCodigoBarras(String codigoBarras);
	
	

}
