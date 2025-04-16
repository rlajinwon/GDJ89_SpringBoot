package com.one.app.board;

import java.util.List;

public interface BoardService {
	
	public List<BoardVO> getList() throws Exception;
	
	
	public BoardVO getDetail(BoardVO boardVO) throws Exception;
	
	public int add(BoardVO boardVO) throws Exception;
	

}
