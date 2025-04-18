/*
 * package com.one.app.board.notice;
 * 
 * import static org.junit.jupiter.api.Assertions.*;
 * 
 * import java.util.ArrayList; import java.util.Iterator; import java.util.List;
 * 
 * import org.junit.jupiter.api.Test; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.boot.test.context.SpringBootTest;
 * 
 * import com.one.app.board.BoardVO; import com.one.app.home.util.Pager;
 * 
 * import lombok.extern.slf4j.Slf4j;
 * 
 * 
 * @SpringBootTest class NoticeDAOTest {
 * 
 * @Autowired private NoticeDAO noticeDAO;
 * 
 * 
 * @Test void testTest() throws Exception{
 * 
 * List<BoardVO> ar = new ArrayList<>();
 * 
 * for(int i=0;i<100;i++) { BoardVO boardVO = new BoardVO();
 * 
 * boardVO.setBoardTitle("title"+i); boardVO.setBoardContents("contents"+i);
 * boardVO.setUserName("user"+i);
 * 
 * ar.add(boardVO); }
 * 
 * int result = noticeDAO.test(ar);
 * 
 * assertNotEquals(0, result);
 * 
 * }
 * 
 * 
 * 
 * 
 * @Test public void testGetListPaging() throws Exception{ // 1페이지, 10개씩 보기
 * Pager pager = new Pager(); pager.setPage(1L); pager.setPerPage(10L);
 * pager.makeNum(); // startNum 계산 필수!
 * 
 * List<BoardVO> list = noticeDAO.getList(pager);
 * 
 * assertNotNull(list); assertEquals(10, list.size(), "한 페이지에 10개가 나와야 함");
 * 
 * System.out.println("----- 1페이지 결과 -----"); for (BoardVO dto : list) {
 * System.out.println(dto.getBoardTitle()); } }
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * @Test void test() throws Exception { Pager pager = new Pager(); List<BoardVO>
 * ar = noticeDAO.getList(pager);
 * 
 * for(BoardVO boardVO:ar) {
 * 
 * }
 * 
 * 
 * }
 * 
 * @Test void test1() throws Exception{ BoardVO boardVO = new BoardVO(); BoardVO
 * dto = noticeDAO.getDetail(boardVO); assertNotNull(dto);
 * 
 * 
 * }
 * 
 * @Test void test2() throws Exception{
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * }
 * 
 * 
 * 
 * }
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */