package com.egor.service.action;

import com.egor.persistence.dao.UserDAO;
import com.egor.persistence.exception.DataAccessException;
import com.egor.persistence.model.User;

public class HibernateTest {

	private static UserDAO userDao;

	public static void main(String args[]) throws DataAccessException {
		User user = new User();
		user.setUserName("Ankur");
		user.setPassword("egoRocks");
		System.out.println("Saving User Data: " + user);
		userDao.save(user);
		System.out.println("Saving User Data for userId: " + user.getUserId());
	}

	public static UserDAO getUserDao() {
		return userDao;
	}

	public static void setUserDao(UserDAO userDao) {
		System.out.println("UserDao Set HERE :: " + userDao);
		HibernateTest.userDao = userDao;
	}

}
