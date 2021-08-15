package kr.co.ictedu.users.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface IUserService {
	
	void execute(HttpServletRequest request, HttpServletResponse response);
}	
