package com.example.demo.poc.model;

import java.util.List;

public class Response{
	private List<RowsItem> rows;

	public void setRows(List<RowsItem> rows){
		this.rows = rows;
	}

	public List<RowsItem> getRows(){
		return rows;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"rows = '" + rows + '\'' + 
			"}";
		}
}