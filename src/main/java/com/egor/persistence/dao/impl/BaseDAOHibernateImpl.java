package com.egor.persistence.dao.impl;

import java.io.Serializable;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.transaction.annotation.Transactional;

import com.egor.persistence.dao.BaseDAO;
import com.egor.persistence.exception.DataAccessException;

@Transactional
public abstract class BaseDAOHibernateImpl<T, PK extends Serializable>
		implements BaseDAO<T, PK> {

	private Class<T> entityClass;
	protected SessionFactory sessionFactory;

	public BaseDAOHibernateImpl(final Class<T> entityClass) {
		this.entityClass = entityClass;
	}

	@SuppressWarnings("unchecked")
	public PK save(final T newInstance) throws DataAccessException {
		try {
			Object result = getSessionFactory().getCurrentSession().save(
					newInstance);
			return (PK) result;

		} catch (Exception e) {
			throw new DataAccessException(e.getMessage());
		}
	}

	public void saveOrUpdate(final T transientObject)
			throws DataAccessException {
		try {
			getSessionFactory().getCurrentSession().saveOrUpdate(
					transientObject);
		} catch (Exception e) {
			throw new DataAccessException(e.getMessage());
		}
	}

	@SuppressWarnings("unchecked")
	public T read(final PK id) throws DataAccessException {
		try {
			Object result = getSessionFactory().getCurrentSession().get(
					entityClass, id);
			return (T) result;
		} catch (Exception e) {
			throw new DataAccessException(e.getMessage());
		}
	}

	@SuppressWarnings("unchecked")
	public T findById(final PK id) throws DataAccessException {
		try {
			Object result = getSessionFactory().getCurrentSession().get(
					entityClass, id);
			return (T) result;
		} catch (Exception e) {
			throw new DataAccessException(e.getMessage());
		}
	}

	public void update(final T entity) throws DataAccessException {
		try {
			getSessionFactory().getCurrentSession().update(entity);
		} catch (Exception e) {
			throw new DataAccessException(e.getMessage());
		}
	}

	public void delete(final T persistentObject) throws DataAccessException {
		try {
			getSessionFactory().getCurrentSession().delete(persistentObject);
		} catch (Exception e) {
			throw new DataAccessException(e.getMessage());
		}
	}

	protected DetachedCriteria createDetachedCriteria()
			throws DataAccessException {
		DetachedCriteria result = null;
		try {
			result = DetachedCriteria.forClass(entityClass);
		} catch (Exception e) {
			throw new DataAccessException(e.getMessage());
		}
		return result;
	}

	public String getPostfix() {
		return entityClass.getSimpleName();
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}
