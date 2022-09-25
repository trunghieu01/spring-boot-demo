package com.spring.spring_data_jpa.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "chungnhan")
public class ChungNhan {
	@Id
//	@ManyToOne
	private String manv;
//	@Id
//	@ManyToOne
	private int mamb;
	public String getManv() {
		return manv;
	}
	public void setManv(String manv) {
		this.manv = manv;
	}
	public int getMamb() {
		return mamb;
	}
	public void setMamb(int mamb) {
		this.mamb = mamb;
	}
//	@ManyToOne 
//    @JoinColumn(name = "mamb") // thông qua khóa ngoại address_id
//    private MayBay mamb;
	
}
