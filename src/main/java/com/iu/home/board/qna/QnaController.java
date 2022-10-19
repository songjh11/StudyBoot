package com.iu.home.board.qna;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.iu.home.util.Pager;

@Controller
@RequestMapping(value = "/qna/*")
public class QnaController {
	
	@Autowired
	private QnaService qnaService;
	
	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping("list")
	public ModelAndView getList (Pager pager) throws Exception {
		
		List<QnaVO> ar = qnaService.getList(pager);
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("list", ar);
		mv.setViewName("/board/list");
		return mv;
		
	}
	
	@GetMapping("add")
	public ModelAndView setWrite () {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/board/write");
		return mv;
	}
	
	@PostMapping("add")
	public String setAdd(QnaVO qnaVO, MultipartFile [] files, RedirectAttributes redirectAttributes) throws Exception {
		int result = qnaService.setOne(qnaVO);
		log.debug("Result {}", result);
		redirectAttributes.addAttribute("result", result);
		return "redirect:./list";
	}
}
