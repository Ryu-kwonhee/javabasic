package kr.co.ictedu.service;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.co.ictedu.board.model.BoardDAO;
import kr.co.ictedu.board.model.BoardVO;

// IBoardService 구현하기
public class BoardUpdateService implements IBoardService {

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
		
		// 오버라이딩된 메서드 내부 작성하기

			// 1. 파라미터 6개 받아오기
			
			String strbid = request.getParameter("bid");
			int bid = Integer.parseInt(strbid);
			String strbhit = request.getParameter("bhit");
			int bhit = Integer.parseInt(strbhit);
			String tbdate = request.getParameter("bdate");
			Timestamp bdate = Timestamp.valueOf(tbdate); 
			String bname = request.getParameter("bname");
			String btitle = request.getParameter("btitle");
			String bcontent = request.getParameter("bcontent");
			
			// 2. VO 생성해서 세터로 저장하기
			BoardVO board = new BoardVO();
			board.setBid(bid);
			board.setBhit(bhit);
			board.setBdate(bdate);
			board.setBname(bname);
			board.setBtitle(btitle);
			board.setBcontent(bcontent);
			
			// 3. DAO 생성 및  update로직 호출(update로직은 직접작성)
			BoardDAO dao = BoardDAO.getInstance();
			dao.updateBoard(board);
	}
	
	
}
