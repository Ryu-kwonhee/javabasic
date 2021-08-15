package kr.co.ictedu.service;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.co.ictedu.board.model.BoardDAO;
import kr.co.ictedu.board.model.BoardVO;
// IBoardService 인터페이스 구현
public class BoardDeleteService implements IBoardService {
	// execute 메서드 오버라이딩
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		HttpSession session = null;
		session = request.getSession();
		String idSession = (String)session.getAttribute("session_id");
		
		if(idSession == null) {
			try {
				String ui = "/users/user_login.jsp";
				RequestDispatcher dp = request.getRequestDispatcher(ui);
				dp.forward(request, response);
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		// bid 파라미터(디테일 페이지에서 post방식으로 날려준) 받기
		String bid = request.getParameter("bid");
		
		// DAO생성
		// delete로직에 bid 넣어서 실행 
		BoardDAO dao = BoardDAO.getInstance();
		dao.deleteBoard(bid); 
	}
	
}
