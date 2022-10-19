package com.iu.home.util;

import java.io.File;
import java.util.UUID;

import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j 
public class FileManager {

	public String saveFile(MultipartFile multipartFile, String path) throws Exception{
		
		//1. 중복되지 않는 파일명 생성(UUID, DATE)
		String fileName = UUID.randomUUID().toString();
		
		//2. 확장자 필요하기 때문에 살려야 됨 
		StringBuffer bf = new StringBuffer(); //빈 문자열 생성
		bf.append(fileName);
		bf.append("_");
		bf.append(multipartFile.getOriginalFilename()); //++보다 이런식으로 객체를 줄여나가는 방식을 선택할것
		log.info("File Name: {}", bf.toString());
		
		//3. 파일 저장하기
		File file = new File(path, bf.toString());
		
		//FileCopyUtils
		//Multipartfile
		
//		FileCopyUtils.copy(multipartFile.getBytes(), file);
		multipartFile.transferTo(file);
		
		return bf.toString();
	}
}
