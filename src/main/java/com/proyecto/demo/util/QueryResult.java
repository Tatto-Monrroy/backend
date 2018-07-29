package com.proyecto.demo.util;

import java.util.List;

public class QueryResult {
	
	private int totalRecords;
	private List<Object> list;
	
	
	
	/**
	 * @return the totalRecords
	 */
	public int getTotalRecords() {
		return totalRecords;
	}
	/**
	 * @param totalRecords the totalRecords to set
	 */
	public void setTotalRecords(int totalRecords) {
		this.totalRecords = totalRecords;
	}
	/**
	 * @return the list
	 */
	public List<Object> getList() {
		return list;
	}
	/**
	 * @param list the list to set
	 */
	public void setList(List<Object> list) {
		this.list = list;
	}

}
