package kr.co.ictedu.service;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.co.ictedu.board.model.BoardDAO;
import kr.co.ictedu.board.model.BoardVO;

public class BoardDetailService implements IBoardService {

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
		
		
		// url에 묻어온 글 번호를 getParameter를 이용해 얻습니다.
		String bid = request.getParameter("bid");
		// DAO를 생성합니다.
		BoardDAO dao = BoardDAO.getInstance();
		
		// 먼저 조회수를 올리고 가져와야 최신 조회수를 표시할 수 있음.
		dao.upHit(bid);
		
		
		// DAO에 글 번호를 넘겨서 detail페이지 데이터를 얻어옵니다.
		BoardVO board = dao.getBoardDetail(bid);
		System.out.println("페이지 조회 전 upHit 실행 : "+board);
		// 포워딩을 위해 setAttribute()로 데이터를 실어줍니다.
		request.setAttribute("board", board);
	}
	
}
