package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.repository.IFacturaRepo;

@Service
public class FacturaServiceImpl implements IFacturaService {

	private IFacturaRepo facturaRepo;
	@Override
	public void insertar(String productos, String cedula, String numero) {
		// TODO Auto-generated method stub
		this.facturaRepo.insertar(productos, cedula, numero);
	}

}
