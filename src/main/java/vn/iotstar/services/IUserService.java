package vn.iotstar.services;

import java.util.List;

import vn.iotstar.entity.User;

public interface IUserService {
	
	int count();

	List<User> findAll(int page, int pagesize);
	
	List<User> findByEmail(String email);

	List<User> findAll();

	User findById(int id);

	void delete(int id) throws Exception;

	void update(User user);

	void insert(User user);
}
