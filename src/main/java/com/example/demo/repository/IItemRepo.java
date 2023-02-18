package com.example.demo.repository;

import com.example.demo.modelo.Item;

public interface IItemRepo {

	public void insertar(String stock);
	public Item buscarCodigoBarras(String codigoBarras);
}
