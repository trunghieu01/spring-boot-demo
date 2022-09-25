package com.spring.spring_data_jpa.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nhanvien")
public class NhanVien {
	@Id
	private String manv;
	private String ten;
	private int luong;
	
	public String getManv() {
		return manv;
	}
	public void setManv(String manv) {
		this.manv = manv;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getLuong() {
		return luong;
	}
	public void setLuong(int luong) {
		this.luong = luong;
	}

//	@OneToMany
//	private ChungNhan chungnhan;
//
//	public ChungNhan getChungnhan() {
//		return chungnhan;
//	}
//	public void setChungnhan(ChungNhan chungnhan) {
//		this.chungnhan = chungnhan;
//	}
	
}
