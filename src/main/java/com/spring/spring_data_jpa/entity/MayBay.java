package com.spring.spring_data_jpa.entity;

import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Table(name = "maybay")
public class MayBay {
	@Id
	private int maMB;
	@Column(name = "Loai")
	private String loai;
	@Column(name = "TamBay")
	private int tamBay;
	
	public int getMaMB() {
		return maMB;
	}
	public void setMaMB(int maMB) {
		this.maMB = maMB;
	}
	public String getLoai() {
		return loai;
	}
	public void setLoai(String loai) {
		this.loai = loai;
	}
	public int getTamBay() {
		return tamBay;
	}
	public void setTamBay(int tamBay) {
		this.tamBay = tamBay;
	}
	@Override
	public String toString() {
		return "MayBay [maMB=" + maMB + ", loai=" + loai + ", tamBay=" + tamBay + "]";
	}
}
