package com.tedu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.tedu.pojo.User;

public interface UserMapper {
	@Select("select id,name,birthday,address from user")
	public List<User> findAll();
	@Insert("insert into user (name,birthday,address) value(#{user.name},#{user.birthday},#{user.address})")
	public void insert(@Param("user") User user);
	@Delete("delete from user where id=#{id}")
	public void delete(Integer id);
	@Update("update user set name=#{name},birthday=#{birthday},address=#{address} where id=#{id}")
	public void update(User user);
	

}
