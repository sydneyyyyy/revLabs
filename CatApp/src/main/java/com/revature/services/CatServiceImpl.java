package com.revature.services;

import java.util.List;

import com.revature.models.Cat;
import com.revature.repositories.CatDAO;

public class CatServiceImpl implements CatService {
	
	// should not be making calls to our database only the DAO class should
	
	private static CatDAO cdao = new CatDAO();

	@Override
	public Cat addCat(Cat c) {
		return cdao.add(c);
	}

	@Override
	public Cat getCat(Integer id) {
		return cdao.getById(id);
	}

	@Override
	public List<Cat> getAllCats() {
		return cdao.getAll();
	}

	@Override
	public boolean updateCat(Cat c) {
		return cdao.update(c);
	}

	@Override
	public boolean deleteCat(Cat c) {
		return cdao.delete(c);
	}

}
