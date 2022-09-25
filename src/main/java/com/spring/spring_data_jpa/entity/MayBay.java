package com.spring.spring_data_jpa.entity;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Table(name = "maybay")
public class MayBay {
	@Id
	private int mamb;
	private String loai;
	private int tambay;

	public int getMaMB() {
		return mamb;
	}

	public void setMaMB(int maMB) {
		this.mamb = maMB;
	}

	public String getLoai() {
		return loai;
	}

	public void setLoai(String loai) {
		this.loai = loai;
	}

	public int getTamBay() {
		return tambay;
	}

	public void setTamBay(int tamBay) {
		this.tambay = tamBay;
	}

//	@OneToMany(mappedBy = "mamb", cascade = CascadeType.ALL)
//	Collection<ChungNhan> chungnhan;

}
