package com.tedu.controller;

import java.util.List;

import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tedu.Service.UserService;
import com.tedu.pojo.User;

@RestController   //使用@RestController替代@Controller和@ResponseBody（返回json串）
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping("/findAll")
	public List<User> findAll(){
		return userService.findAll();

	}
	@RequestMapping("/insert/{name}/{birthday}/{address}")
	public String insert(User user){
		try{
			userService.insert(user);
			return "insert success";
		}catch(Exception e){
			e.printStackTrace();
		}
		return "insert error";
	}
	@RequestMapping("/update/{name}/{birthday}/{address}/{id}")
	public String Update(User user){
		try {
			userService.update(user);
			return "update ok";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "update error";
		
	}
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable Integer id){
		try {
			userService.delete(id);
			return "delete success";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "delete error";
	}
	
}
