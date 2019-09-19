package com.screen.vo;

import java.util.HashMap;

public class ETCVo {
	private String provice;
	private long total;
	private HashMap<String, Integer> monthlVolume;
	
	public ETCVo() {
		super();
	}
	public String getProvice() {
		return provice;
	}
	public void setProvice(String provice) {
		this.provice = provice;
	}
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public HashMap<String, Integer> getMonthlVolume() {
		return monthlVolume;
	}
	public void setMonthlVolume(HashMap<String, Integer> monthlVolume) {
		this.monthlVolume = monthlVolume;
	}
	
	
}
