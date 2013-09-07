package com.egor.persistence.dao;

import java.io.Serializable;

import com.egor.persistence.exception.DataAccessException;

public interface BaseDAO<T, PK extends Serializable> {

	PK save(T newInstance) throws DataAccessException;

	void update(T transientObject) throws DataAccessException;

	void saveOrUpdate(T transientObject) throws DataAccessException;

	void delete(T persistentObject) throws DataAccessException;

	T read(PK id) throws DataAccessException;

	T findById(PK id) throws DataAccessException;

}