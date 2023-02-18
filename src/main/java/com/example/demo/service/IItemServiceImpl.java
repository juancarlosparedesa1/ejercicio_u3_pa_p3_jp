package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Item;
import com.example.demo.repository.IItemRepo;
@Service 
public class IItemServiceImpl implements IItemRepo {
	@Autowired
	private IItemRepo iItemRepo;
	@Override
	public void insertar(String stock) {
		// TODO Auto-generated method stub
		this.iItemRepo.insertar(stock);
	}
	@Override
	public Item buscarCodigoBarras(String codigoBarras) {
		// TODO Auto-generated method stub
		return this.buscarCodigoBarras(codigoBarras);
	}



}
