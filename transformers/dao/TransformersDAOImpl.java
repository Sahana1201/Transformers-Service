package com.xworkz.transformers.dao;

import java.util.Collection;
import java.util.HashSet;

import com.xworkz.transformers.dto.TransformersDTO;

public class TransformersDAOImpl implements TransformersDAO {

	private Collection<TransformersDTO> collection = new HashSet<TransformersDTO>();

	@Override
	public boolean save(TransformersDTO dto) {
		System.out.println("invoked save method");
		return this.collection.add(dto);
	}

}
