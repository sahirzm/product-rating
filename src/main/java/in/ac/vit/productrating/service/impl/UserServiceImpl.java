package in.ac.vit.productrating.service.impl;

import in.ac.vit.productrating.dao.UserDao;
import in.ac.vit.productrating.model.User;
import in.ac.vit.productrating.service.UserService;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

public class UserServiceImpl implements UserService {

	private UserDao userDao;
	private transient Logger log = Logger.getLogger(UserServiceImpl.class);

	public UserServiceImpl(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public User save(User x) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User update(User x) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(User x) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int key) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<User> getPaged(int first, int pageSize, String sortField,
			String sortOrder, Map<String, String> filters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getCount(Map<String, String> filters) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findByEmail(String email) {
		this.log.debug("getting user ==> " + email);
		return this.getUserDao().getByEmail(email);
	}

	@Override
	public User findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	protected UserDao getUserDao() {
		return this.userDao;
	}
}