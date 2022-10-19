package com.iu.home.board.qna;

import java.sql.Date;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class QnaVO {

	private Long num;
	private String title;
	private String writer;
	private String contents;
	private Long hit;
	private Date regDate;
	private Long ref;
	private Long depth;
	private Long step;
	
	private MultipartFile [] files;
}
