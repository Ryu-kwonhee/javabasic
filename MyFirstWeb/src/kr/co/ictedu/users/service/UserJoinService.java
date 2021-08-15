package kr.co.ictedu.users.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.ictedu.users.model.UsersDAO;
import kr.co.ictedu.users.model.UsersVO;

public class UserJoinService implements IUserService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		try {
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("utf-8");
			
			String uid = request.getParameter("uid");
			String upw = request.getParameter("upw");
			String uname = request.getParameter("uname");
			String email = request.getParameter("email");
			UsersDAO dao = UsersDAO.getInstance();
			UsersVO user = new UsersVO(uid, upw, uname, email);
			dao.joinUsers(user);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
