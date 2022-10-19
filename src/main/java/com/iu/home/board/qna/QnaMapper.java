package com.iu.home.board.qna;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.iu.home.util.Pager;

@Mapper
@Repository 
public interface QnaMapper {
	
	public List<QnaVO> getList(Pager pager) throws Exception;
	
	public int setOne(QnaVO qnaVO) throws Exception;

}
