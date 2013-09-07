package com.egor.persistence.dao.impl;

import org.springframework.transaction.annotation.Transactional;

import com.egor.persistence.dao.UserDAO;
import com.egor.persistence.model.User;

@Transactional
public class UserDAOImpl extends BaseDAOHibernateImpl<User, Long> implements
		UserDAO {

	public UserDAOImpl() {
		super(User.class);
	}

	public UserDAOImpl(Class<User> entityClass) {
		super(entityClass);
	}
}
