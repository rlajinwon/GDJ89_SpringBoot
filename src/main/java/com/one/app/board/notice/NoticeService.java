package com.one.app.board.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.one.app.board.BoardService;
import com.one.app.board.BoardVO;
import com.one.app.home.util.Pager;


@Service
public class NoticeService implements BoardService{

	@Override
	public int delete(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		return noticeDAO.delete(boardVO);
	}

	@Autowired
	private NoticeDAO noticeDAO;
	
	
	@Override
	public List<BoardVO> getList(Pager pager) throws Exception {
		// TODO Auto-generated method stub
		
		Long totalCount = noticeDAO.getTotalCount(pager);
		
		pager.make(totalCount);
		pager.makeNum();
		List<BoardVO> ar = noticeDAO.getList(pager);
		return ar;
	}

	@Override
	public BoardVO getDetail(BoardVO boardVO) throws Exception {

		return noticeDAO.getDetail(boardVO);
	}

	@Override
	public int add(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		return noticeDAO.add(boardVO);
	}

	@Override
	public int update(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		return noticeDAO.update(boardVO);
	}
	
	
	

	
}
