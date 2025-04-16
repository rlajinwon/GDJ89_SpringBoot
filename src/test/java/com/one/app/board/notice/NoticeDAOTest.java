package com.one.app.board.notice;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.one.app.board.BoardVO;

import lombok.extern.slf4j.Slf4j;


@SpringBootTest
@Slf4j
class NoticeDAOTest {
	
	@Autowired
	private NoticeDAO noticeDAO;

	@Test
	void test() throws Exception {
		List<BoardVO> ar = noticeDAO.getList();
		
		for(BoardVO boardVO:ar) {
			log.info("VO : {}", boardVO);
		}
		
		
	}
	@Test
	void test1() throws Exception{
		BoardVO boardVO = new BoardVO();
		BoardVO dto = noticeDAO.getDetail(boardVO);
		assertNotNull(dto);

	}
	
		
		
}
		
		
	
	
	
	


