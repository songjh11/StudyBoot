package com.iu.home.board.qna;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
//@Rollback(true)
@Transactional
class QnaMapperTest {
	
//	private final Logger log = LoggerFactory.getLogger(this.getClass());
//
	@Autowired
	private QnaMapper qnaMapper;
	
	
	private QnaVO qnaVO;
//	
//	@BeforeAll
//	static void befoAll() {
//		System.out.println("전체 Test 실행 전 !!!!");
//		
//	}
//	
//	@AfterAll
//	static void afterAll(){
//		System.out.println("전체 Test 실행 후 !!!!");
//	}
//	
//	@BeforeEach
//	void beforeEach() throws Exception {
//		System.out.println("Test 메서드 실행 전");
//	}
//	
//	@AfterEach
//	void afterEach() {
//		System.out.println("Test 메서드 실행 후");
//	}
//	
//	@Test
//	void test3() {
//		log.info("Test3 Case");
//	}
//	
//	@Test
//	void test() throws Exception {
//	}
//	
	@Test
	void test2() throws Exception {
			qnaVO = new QnaVO();
			qnaVO.setTitle("title");
			qnaVO.setWriter("writer");
			qnaVO.setContents("contents");
			int result = qnaMapper.setOne(qnaVO);
			assertEquals(1, result);
			
		}

}
