package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Item;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
@Transactional
@Repository
public class ItemRepoImpl implements IItemRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(String stock) {
		// TODO Auto-generated method stub
		Item item=new Item();
		item.setCodigoBarras(null);
//		if (datoCodigoBarras!=null) {
//			
//		}
				
	}

	@Override
	public Item buscarCodigoBarras(String codigoBarras) {
		// TODO Auto-generated method stub
		//creamosQuery
		Query myNativeQuery =this.entityManager.createNativeQuery("select * from Item where item_barras=:datoCodigoBarras  ");
		//seteamosQuery
		myNativeQuery.setParameter("datoCodigoBarras", codigoBarras);
		//obtenemosQuery
		return (Item) myNativeQuery.getSingleResult();
	}

}
