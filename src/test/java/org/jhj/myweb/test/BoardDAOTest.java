package org.jhj.myweb.test;

import org.jhj.myweb.domain.BoardVO;
import org.jhj.myweb.persistence.BoardDAO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/root-context.xml" })
public class BoardDAOTest {

	@Autowired
	private BoardDAO dao;
	private static Logger logger = LoggerFactory.getLogger(BoardDAOTest.class);
	
	@Test
	public void testReadBoard() throws Exception {
		// 게시글 확인 테스트
		BoardVO vo;
		vo = dao.read(1);

		logger.info("------------------------------------------------------------");
		logger.info(vo.toString());
		logger.info("------------------------------------------------------------");
	}
}
