package com.revature.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.revature.beans.Cat;

@Repository
public interface CatRepo extends CrudRepository<Cat, Integer> {

}
