package org.jobs.ws.bean;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.apache.log4j.Logger;
import org.jobs.persistence.bean.Group;
import org.jobs.persistence.bean.Role;
import org.jobs.persistence.bean.User;
import org.jobs.persistence.dao.GroupDao;
import org.jobs.persistence.dao.RoleDao;
import org.jobs.persistence.dao.UserDao;
import org.jobs.persistence.dao.impl.DaoImpl.Sort;

@SuppressWarnings("unused")
public class UsersManagerBean implements UsersManager {

	private static Logger log = Logger.getLogger(UsersManagerBean.class);

	private UserDao userDao;
	private RoleDao roleDao;
	private GroupDao groupDao;

	public void setGroupDao(GroupDao groupDao) {
		this.groupDao = groupDao;
	}

	public void setRoleDao(RoleDao roleDao) {
		this.roleDao = roleDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public UsersManagerBean() {
	}

	public User getUser(long id) {
		return userDao.get(id);
	}

	public List<User> getUserAll() {
		return userDao.getAll();
	}

	public User createUser(User user) {
		userDao.create(user);
		return user;
	}

	@Override
	public User getLogin(String login, String pass) {
		User user = userDao.findUserByLogin(login);
		if (user != null && user.getPassword().equals(pass)) {
			return user;
		} else {
			return null;
		}
	}

	@Override
	public User updateUser(User user) {
		return userDao.update(user);
	}

	@Override
	public User getUserByLogin(String login) {
		return userDao.findUserByLogin(login);
	}

	@Override
	public Long createRole(Role role) {
		roleDao.create(role);
		return role.getId();
	}

	@Override
	public List<Group> getGroupAll() {
		return groupDao.getAll();
	}

	@Override
	public List<Role> getRoles() {
		return roleDao.getAll();
	}

	@Override
	public void deleteUser(Long userId) throws Exception {
		User user = userDao.get(userId);
		if (user == null) {
			throw new Exception("Not found user");
		}
		userDao.delete(user);
	}

	@Override
	public List<User> getUserAllOrder(String order, Sort sort) {
		return userDao.getAllBySort(order, sort);
	}
}
