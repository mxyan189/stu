package com.tedu.pojo;

import java.io.Serializable;
import java.util.Date;

import org.apache.ibatis.annotations.Param;
import org.springframework.format.annotation.DateTimeFormat;


public class User implements Serializable {
  private static final long serialVersionUID = -1113131458028604929L;
  
  private Integer id;
  private String name;
  @DateTimeFormat(pattern="yyyy-MM-dd")
  private Date birthday;
  private String address;
  
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Date getBirthday() {
	return birthday;
}
public void setBirthday(Date birthday) {
	this.birthday = birthday;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
  
  
  
}
