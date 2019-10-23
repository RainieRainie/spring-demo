package com.example.demo.poc.model;

import java.util.List;

public class RowsItem{
	private int ticketStatus;
	private List<Integer> entrynumbers;
	private String purchaser;
	private String price;
	private int drawnumber;
	private String lastModifiedDate;
	private String createdDate;
	private int storeid;
	private int winningtier;
	private int serialno;

	public void setTicketStatus(int ticketStatus){
		this.ticketStatus = ticketStatus;
	}

	public int getTicketStatus(){
		return ticketStatus;
	}

	public void setEntrynumbers(List<Integer> entrynumbers){
		this.entrynumbers = entrynumbers;
	}

	public List<Integer> getEntrynumbers(){
		return entrynumbers;
	}

	public void setPurchaser(String purchaser){
		this.purchaser = purchaser;
	}

	public String getPurchaser(){
		return purchaser;
	}

	public void setPrice(String price){
		this.price = price;
	}

	public String getPrice(){
		return price;
	}

	public void setDrawnumber(int drawnumber){
		this.drawnumber = drawnumber;
	}

	public int getDrawnumber(){
		return drawnumber;
	}

	public void setLastModifiedDate(String lastModifiedDate){
		this.lastModifiedDate = lastModifiedDate;
	}

	public String getLastModifiedDate(){
		return lastModifiedDate;
	}

	public void setCreatedDate(String createdDate){
		this.createdDate = createdDate;
	}

	public String getCreatedDate(){
		return createdDate;
	}

	public void setStoreid(int storeid){
		this.storeid = storeid;
	}

	public int getStoreid(){
		return storeid;
	}

	public void setWinningtier(int winningtier){
		this.winningtier = winningtier;
	}

	public int getWinningtier(){
		return winningtier;
	}

	public void setSerialno(int serialno){
		this.serialno = serialno;
	}

	public int getSerialno(){
		return serialno;
	}

	@Override
 	public String toString(){
		return 
			"RowsItem{" + 
			"ticket_status = '" + ticketStatus + '\'' + 
			",entrynumbers = '" + entrynumbers + '\'' + 
			",purchaser = '" + purchaser + '\'' + 
			",price = '" + price + '\'' + 
			",drawnumber = '" + drawnumber + '\'' + 
			",last_modified_date = '" + lastModifiedDate + '\'' + 
			",created_date = '" + createdDate + '\'' + 
			",storeid = '" + storeid + '\'' + 
			",winningtier = '" + winningtier + '\'' + 
			",serialno = '" + serialno + '\'' + 
			"}";
		}
}