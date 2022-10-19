package com.iu.home.util;

import lombok.Data;

@Data
public class Pager {

	private Long page;
	private Long perPage;
	private Long startRow;
	private String search;
	
	public Long getPage() {
		if(this.page==null||this.page<=0) {
			this.page=1L;
		}
		return page;
	}
	
	public Pager() {
		this.perPage = 10L;
	}
	
	//객체 생성시 초기값
	public Pager(Long perPage) {
		this.perPage = perPage;
	}
	
	public String getSearch() {
		if(search==null) {
			this.search = "";
		}
		return search;
	}
	
	public void makeRow() {
		this.startRow = (this.getPage()-1)*this.getPerPage();
		
	}
	
	
}
