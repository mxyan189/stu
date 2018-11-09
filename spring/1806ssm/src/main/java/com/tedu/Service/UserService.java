package com.tedu.Service;

import java.util.List;

import com.tedu.mapper.UserMapper;
import com.tedu.pojo.User;

public interface UserService {
	public List<User> findAll();
	public void insert(User user);
	public void delete(Integer id);
	public void update(User user);
}
