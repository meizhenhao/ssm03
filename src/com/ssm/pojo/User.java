package com.ssm.pojo;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

public class User {
	
	@NotBlank(message="用户名不能为空！")
	private String username;
	
	@Length(max=12,min=6,message="密码长度在6-12之间！")
	private String password;
	
	@Email(message="不是正确的邮箱格式！")
	private String email;
	
	@Pattern(regexp="[1][3|5|8][0-9]{9}" , message="不是正确的手机号码格式！")
	private String phore;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhore() {
		return phore;
	}
	public void setPhore(String phore) {
		this.phore = phore;
	}
	

}
