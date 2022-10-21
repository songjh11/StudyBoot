package com.iu.home.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.view.AbstractView;

import com.iu.home.board.qna.QnaFileVO;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j 
public class FileManager extends AbstractView {
	
	

	@Override
	protected void renderMergedOutputModel(Map<String, Object> model, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		 QnaFileVO qnaFileVO = (QnaFileVO)model.get("fileVO");
		 String path = (String)model.get("path"); 
		 log.info("=======================================================");
		 log.info("FileVO:{}", qnaFileVO);
		 
		 File file = new File("C:/result/upload/"+path, qnaFileVO.getFileName());
		 
		 //한글 처리
		 response.setCharacterEncoding("UTF-8");
		 
		 //총 파일의 크기
		 response.setContentLengthLong(file.length());
		 
		 //다운로드 시 파일의 이름을 인코딩
		 String oriName = URLEncoder.encode(qnaFileVO.getOriName(), "UTF-8");
		 
		 //header 설정
		 response.setHeader("Content-Disposition", "attachment;filename=\""+oriName+"\"");
		 response.setHeader("Content-Transfer-Encoding", "binary");
		 
		 //HDD에서 파일을 읽고 
		 FileInputStream fi = new FileInputStream(file);
		 //Client 전송 준비
		 OutputStream os = response.getOutputStream();
		 
		 //전송
		 FileCopyUtils.copy(fi, os);
		 
		 //자원해제
		 os.close();
		 fi.close();
		 
		 
	}

	public String saveFile(MultipartFile multipartFile, String path) throws Exception{
		
		//1. 중복되지 않는 파일명 생성(UUID, DATE)
		String fileName = UUID.randomUUID().toString();
		
		//2. 확장자 필요하기 때문에 살려야 됨 
		StringBuffer bf = new StringBuffer(); //빈 문자열 생성
		bf.append(fileName);
		//bf.append(multipartFile.getOriginalFilename()); //++보다 이런식으로 객체를 줄여나가는 방식을 선택할것
		log.info("File Name: {}", bf.toString());
		
		//파일명과 확장자 분리
		String ex = multipartFile.getOriginalFilename();//아이유.jpg
		ex = ex.substring(ex.lastIndexOf("."));
		bf.append(ex);
		
		//3. 파일 저장하기
		File file = new File(path, bf.toString());
		
		//FileCopyUtils
		//Multipartfile
		
//		FileCopyUtils.copy(multipartFile.getBytes(), file);
		multipartFile.transferTo(file);
		fileName = bf.toString();
		return fileName;
	}
}
