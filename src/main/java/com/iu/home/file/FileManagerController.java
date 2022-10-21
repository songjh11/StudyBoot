package com.iu.home.file;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import com.iu.home.board.qna.QnaFileVO;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class FileManagerController {
	
//	@GetMapping("/fileDown/{path}/{num}") RestFul, RestAPI
	@GetMapping("/fileDown/{p}") 
	public ModelAndView fileDown(@PathVariable(name="p") String path, QnaFileVO qnaFileVO) throws Exception{
		log.info("Path:{}",path);
		//DB에서 정보 조회
		qnaFileVO.setFileName("7dd61bf8-5016-4df5-9dfa-b91b0bee5860.png");
		qnaFileVO.setOriName("아코_액자_속_고양이_PC.png");
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("fileVO", qnaFileVO);
		mv.addObject("path", path);
		mv.setViewName("fileManager");
		return mv;
	}
	

	

}
