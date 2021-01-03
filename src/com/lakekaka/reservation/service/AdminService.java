package com.lakekaka.service;

import com.lakekaka.pojo.Admin;

public interface AdminService {

	public Admin findById(int id);
	
	public Admin findByName(String name);
	
	public boolean changePassword(String password, Admin admin);
	
	public boolean adminRegister(Admin admin);
	
	public boolean changeInformation(Admin admin);
}
